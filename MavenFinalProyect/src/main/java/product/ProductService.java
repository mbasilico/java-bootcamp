package product;

import java.util.List;

public interface ProductService {

	public void persist(Product entity);

	public void update(Product entity);

	public Product findById(String id);

	public void delete(String id);
	
	public List<Product> findAll();
	
	public void deleteAll();

}
