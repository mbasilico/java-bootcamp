package shoppingcart.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import shoppingcart.model.User;
import shoppingcart.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	UserService userService;

	@RequestMapping(value = "/newUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean newUser(@RequestParam String userName, @RequestParam String userPassword,
			@RequestParam String userShippingAdress) throws Exception {
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setUserShippingAdress(userShippingAdress);
		return userService.addNewUser(user);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public boolean login(String userName, String userPassword) {
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		userService.loginGetUser(userName, userPassword);

		return false;
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String helloTest() {
		return "hello";
	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers() {
		try {
			return userService.requestUsers();
		} catch (Exception e) {
			System.out.println("there're no users. " + e);
		}
		return null;
	}
}
