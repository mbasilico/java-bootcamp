package shoppingcart.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import shoppingcart.model.CashPayment;
import shoppingcart.model.CreditCardPayment;
import shoppingcart.model.Item;
import shoppingcart.model.PayPalPayment;
import shoppingcart.services.ShoppingCartService;

@RestController
@RequestMapping("/api/cart")
@EnableAutoConfiguration
public class ShoppingCartController {

	@Autowired
	ShoppingCartService service;

	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public void newCart() {
		service.newCart();
	}

	@RequestMapping(value = "/{idcart}", method = RequestMethod.GET)
	public List<Item> getItemsInCart(@PathVariable Long idcart) {
		return service.getCart(idcart);
	}

	@RequestMapping(value = "/{idcart}/item/{itemID}", method = RequestMethod.POST)
	public void addItemToCart(@PathVariable Long idcart, @PathVariable Long itemID) {
		service.addItemToCart(idcart, itemID);
	}

	@RequestMapping(value = "/{idcart}/item/{itemID}", method = RequestMethod.DELETE)
	public void delItemInCart(@PathVariable Long idcart, @PathVariable Long itemID) {
		service.removeItemInCart(idcart, itemID);
	}

	@RequestMapping(value = "/{idcart}/pay", method = RequestMethod.POST)
	public @ResponseBody Double paycart(@PathVariable Long idcart, @RequestParam String pay, @RequestParam String user,
			@RequestParam String pass, @RequestParam String ccName, @RequestParam int number) {
		double d = 0;
		if (pay.equals("cash")) {
			d = service.payCart(idcart, new CashPayment());
		}
		if (pay.equals("paypal")) {
			d = service.payCart(idcart, new PayPalPayment(user, pass));
		}
		if (pay.equals("credit")) {
			d = service.payCart(idcart, new CreditCardPayment(ccName, number));
		}
		return d;
	}

	@RequestMapping(value = "/{idcart}", method = RequestMethod.DELETE)
	public ArrayList<Item> delCart(@PathVariable Long idcart) {
		return service.deleteCart(idcart);
	}

}
