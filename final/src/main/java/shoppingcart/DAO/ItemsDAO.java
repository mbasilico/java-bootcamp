package shoppingcart.DAO;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import shoppingcart.model.Item;

public interface ItemsDAO extends CrudRepository<Item, Long>{

	List<Item> findByCategory(String category);

	Item getByName(String name);
}
