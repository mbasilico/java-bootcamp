package product;

import java.util.List;

public interface ProductDAO<P, Id> {

	public void persist(P product);

	public void update(P product);

	public P findById(Id id);

	public void delete(P product);

	public List<P> findAll();

	public void deleteAll();

}
