package shoppingcart.DAO;

import java.io.Serializable;
import java.util.List;

public interface UserDAOInterface<T, id extends Serializable> {

		public void add(T entity);

		public void update(T entity);

		public T findById(id id);

		public void delete(T entity);

		public List<T> findAll();

}