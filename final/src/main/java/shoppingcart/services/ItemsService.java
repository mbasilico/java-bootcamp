package shoppingcart.services;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shoppingcart.DAO.ItemsDAO;
import shoppingcart.model.Item;

@Service
public class ItemsService {

	@Autowired
	ItemsDAO itemDao;

	public String addItem(Item i) {
		if (((List<Item>) itemDao.findAll()).contains(i))
			return "item already in db";
		else
			itemDao.save(i);
		return null;
	}

	public ArrayList<Item> getItems() {
		return (ArrayList<Item>) itemDao.findAll();
	}

	public Item getItem(Long id) {
		return itemDao.findOne(id);

	}

	public void removeItem(Long id) {
		itemDao.delete(id);
	}

	public ArrayList<Item> getItemsInCat(String category) {
		return (ArrayList<Item>) itemDao.findByCategory(category);
	}
	
	public Set<String> getCats() {
		Set<String> set= new HashSet<String>();
		ArrayList<Item> a = new ArrayList<Item>();
		a=(ArrayList<Item>) itemDao.findAll();
		for (Item i: a)
			set.add(i.getCategory());
		return set;
	}

	public ArrayList<Item> getItemByName(String name) {
		
		return itemDao.findByName(name);
	}

}
