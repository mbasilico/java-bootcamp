package shoppingcart.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import shoppingcart.model.Item;

@Repository
@Transactional
public interface ItemsDAO extends CrudRepository<Item, Long>{

	List<Item> findByCategory(String category);

	ArrayList<Item> findByName(String name);
}
