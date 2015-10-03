package product;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {

	private static ProductDAOImp productDAOImp;

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

}
