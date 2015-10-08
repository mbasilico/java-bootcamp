package shoppingcart.repository;

import java.util.List;

import shoppingcart.model.Product;

public interface ProductDAO<T, Id> {

	public void persist(T product);

	public void update(T product);

	public T findById(Id id);

	public void delete(T product);

	public List<T> findAll();

	public void deleteAll();
	
	public Product findByName(String name);

}
