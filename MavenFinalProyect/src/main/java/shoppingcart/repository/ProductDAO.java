package shoppingcart.repository;

import java.util.List;

import shoppingcart.model.Product;

public interface ProductDAO {

	public void persist(Product product);

	public void update(Product product);

	public Product findById(Long id);

	public void delete(Product product);

	public List<Product> findAll();

	public void deleteAll();
	
	public Product findByName(String name);

}
