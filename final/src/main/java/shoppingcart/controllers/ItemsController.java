package shoppingcart.controllers;

import java.util.ArrayList;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public void addItem(@RequestParam String category, @RequestParam String description , @RequestParam String name, @RequestParam double price ) {
		Item i = new Item(name,description,category,price);
		service.addItem(i);
	}
	
	@RequestMapping(value="/item",method = RequestMethod.GET)
	public ArrayList<Item> getItems() {
		return service.getItems();
	}

	@RequestMapping(value="/item/{itemID}", method=RequestMethod.GET)
	public Item getItem(@PathVariable Long itemID) {
		return service.getItem(itemID);
	}
	
	@RequestMapping(value="/item/namesearch/{name}", method=RequestMethod.GET)
	public ArrayList<Item> getItemBtName(@PathVariable String name) {
		return service.getItemByName(name);
	}
	
	@RequestMapping(value="/item/{itemID}", method=RequestMethod.DELETE)
	public void delItem(@PathVariable Long itemID) {
		service.removeItem(itemID);
	}
	
	@RequestMapping(value="/category/{category}/", method=RequestMethod.GET)
	public ArrayList<Item> getItemsInCat(@PathVariable String category) {
		return service.getItemsInCat(category);
	}
		
	@RequestMapping(value="/categories", method=RequestMethod.GET)
	public Set<String> getCats() {
		return service.getCats();
	}

}
