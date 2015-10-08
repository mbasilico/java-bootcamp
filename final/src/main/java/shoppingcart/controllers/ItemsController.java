package shoppingcart.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import shoppingcart.model.Item;
import shoppingcart.services.ItemsService;


@RestController
@RequestMapping("/api")
@EnableAutoConfiguration
public class ItemsController {

	@Autowired
	ItemsService service;
	
	@RequestMapping(value="/item",method = RequestMethod.POST)
	public void addItem(Item i) {
		service.addItem(i);
	}
	
	@RequestMapping(value="/item",method = RequestMethod.GET)
	public ArrayList<Item> getItems() {
		return service.getItems();
	}

	@RequestMapping(value="/item/{itemID}", method=RequestMethod.GET)
	public Item getItem(@PathVariable int itemID) {
		return service.getItem(itemID);
	}
	
	@RequestMapping(value="/item/{itemID}", method=RequestMethod.DELETE)
	public void delItem(@PathVariable int itemID) {
		service.removeItem(itemID);
	}
	
	@RequestMapping(value="item/{itemID}", method=RequestMethod.PUT)
	public void modItem(@PathVariable int itemID, @RequestBody Item i) {
		service.modifyItem(itemID, i);
	}
	
	@RequestMapping(value="/category/{categoryID}/", method=RequestMethod.GET)
	public ArrayList<Item> getItemsInCat(@PathVariable int categoryID) {
		return service.getItemsInCat(categoryID);
	}
	
	@RequestMapping(value="/category/{categoryID}", method=RequestMethod.DELETE)
	public void delItemsInCat(@PathVariable int categoryID, @RequestBody Item i) {
		service.delItemsFromCat(i);
	}
	
	@RequestMapping(value="/category", method=RequestMethod.GET)
	public ArrayList<Item> getCats() {
		return service.getCats();
	}
}
