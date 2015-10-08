package shoppingcart.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import shoppingcart.model.Cart;
import shoppingcart.model.User;
import shoppingcart.service.CartServiceImp;
import shoppingcart.service.UserService;

@RestController
@RequestMapping("/cart")
public class CartController {

	@Autowired
	CartServiceImp cartServiceImp;
	@Autowired
	UserService userService;

	public CartController() {
	}

	@RequestMapping("/")
	public String index() {
		return "Cart Controller - Greetings from Spring Boot!";
	}

	@RequestMapping(value = "/getCartByID", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Cart getCartByID(Long id) {
		try {
			Cart cart;
			cart = cartServiceImp.findById(id);
			return cart;
		} catch (Exception e) {
			System.out.println("It couldn't get the cart. " + e);
		}
		return null;
	}

	@RequestMapping(value = "/newCart", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void newCart(@RequestParam Long userID) {
		Cart cart = new Cart();
		User user = userService.findById(userID);
		cart.setCartUserID(user.getUserID());
		cartServiceImp.persist(cart);
	}

	@RequestMapping(value = "/cartPrice", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public BigDecimal totalPrice(Long cartID) {
		BigDecimal total = new BigDecimal(0);
		total = cartServiceImp.getTotalPrice(cartID);
		return total;
	}

}
