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
import shoppingcart.model.PaymentStrategy;
import shoppingcart.model.ShoppingCart;
import shoppingcart.services.ShoppingCartService;

@RestController
@RequestMapping("/api/cart")
@EnableAutoConfiguration
public class ShoppingCartController {

	@Autowired
	ShoppingCartService service;

	@RequestMapping(value = "/{idcart}", method = RequestMethod.GET)
	public ArrayList<Item> getItemsInCart(@PathVariable int idcart) {
		return service.getCart(idcart);
	}

	@RequestMapping(value = "/{idcart}/item", method = RequestMethod.POST)
	public void addItemToCart(@PathVariable ShoppingCart idcart, Item i) {
		service.addItemToCart(idcart, i);
	}

	@RequestMapping(value = "/{idcart}/item/{iditem}", method = RequestMethod.DELETE)
	public void delItemInCart(@PathVariable ShoppingCart idcart, @PathVariable int iditem) {
		service.removeItemInCart(idcart, iditem);
	}

	@RequestMapping(value = "/{idcart}/pay", method = RequestMethod.POST)
	public Item paycart(@PathVariable int idcart, @RequestBody PaymentStrategy pay) {
		return service.payCart(idcart, pay);
	}

	@RequestMapping(value = "/{idcart}", method = RequestMethod.DELETE)
	public ArrayList<Item> delCart(@PathVariable int idcart) {
		return service.deleteCart(idcart);
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String index() {
        return "Cart Controller - Greetings from Spring Boot!";
	}

}
