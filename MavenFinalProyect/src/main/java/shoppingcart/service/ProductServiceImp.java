package shoppingcart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shoppingcart.model.Product;
import shoppingcart.repository.ProductDAOImp;

@Service
public class ProductServiceImp {

	@Autowired
	private ProductDAOImp productDAOImp;

	static {
		System.out.println("Inici� ProductServiceImp");
	}
	public void persist(Product entity) {
		productDAOImp.openCurrentSessionwithTransaction();
		productDAOImp.persist(entity);
		productDAOImp.closeCurrentSessionwithTransaction();
	}

	public void update(Product entity) {
		productDAOImp.openCurrentSessionwithTransaction();
		productDAOImp.update(entity);
		productDAOImp.closeCurrentSessionwithTransaction();
	}

	public Product findById(String id) {
		productDAOImp.openCurrentSession();
		Product product = productDAOImp.findById(id);
		productDAOImp.closeCurrentSession();
		return product;
	}

	public void delete(String id) {
		productDAOImp.openCurrentSessionwithTransaction();
		Product product = productDAOImp.findById(id);
		productDAOImp.delete(product);
		productDAOImp.closeCurrentSessionwithTransaction();
	}

	public List<Product> findAll() {
		productDAOImp.openCurrentSession();
		List<Product> productList = productDAOImp.findAll();
		productDAOImp.closeCurrentSession();
		return productList;
	}

	public void deleteAll() {
		productDAOImp.openCurrentSessionwithTransaction();
		productDAOImp.deleteAll();
		productDAOImp.closeCurrentSessionwithTransaction();
	}
	
	public ProductDAOImp productDAOImp(){
		return productDAOImp;
	}

	public Product findByName(String name) {
		productDAOImp.openCurrentSession();
		Product product = productDAOImp.findByName(name);
		productDAOImp.closeCurrentSession();
		return product;
	}

}
