package shoppingcart.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import shoppingcart.model.Cart;
import shoppingcart.service.CartServiceImp;

@RestController
@RequestMapping("/cart")
@EnableAutoConfiguration
public class CartController {

	@Autowired
	CartServiceImp cartServiceImp;	
	
	@RequestMapping(value = "/getCartByID/{cartID}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Cart getCartByID(@RequestParam Long cartID) {
		try {
			Cart cart = cartServiceImp.findById(cartID);
			return cart;
		} catch (Exception e) {
			System.out.println("It couldn't get the cart. " + e);
		}
		return null;
	}

	@RequestMapping(value = "/newCart", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void newCart(@RequestParam Long userID) {
		Cart cart = new Cart();		
		cart.setCartUserID(userID);
		cartServiceImp.persist(cart);
	}

	@RequestMapping(value = "/cartPrice", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BigDecimal totalPrice(@RequestParam Long cartID) {
		BigDecimal total = new BigDecimal(0);
		total = cartServiceImp.getTotalPrice(cartID);
		return total;
	}

}
