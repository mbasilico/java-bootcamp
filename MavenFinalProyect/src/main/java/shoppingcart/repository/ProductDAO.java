package shoppingcart.repository;

import java.util.List;

import shoppingcart.model.Product;

public interface ProductDAO<P, Id> {

	public void persist(P product);

	public void update(P product);

	public P findById(Id id);

	public void delete(P product);

	public List<P> findAll();

	public void deleteAll();
	
	public Product findByName(String name);

}
