package shoppingcart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import shoppingcart.model.User;
import shoppingcart.service.UserServiceImp;

@RestController
@RequestMapping("/user")
@EnableAutoConfiguration
public class UserController {

	@Autowired
	UserServiceImp userServiceImp;

	@RequestMapping(value = "/newUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean newUser(@RequestParam String userName, @RequestParam String userPassword,
			@RequestParam String userShippingAdress) throws Exception {
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setUserShippingAdress(userShippingAdress);
		return userServiceImp.addNewUser(user);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public boolean login(@RequestParam String userName,@RequestParam String userPassword) {
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);			
		return userServiceImp.loginGetUser(userName, userPassword);	
	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public String helloTest() {
		return "hello";
	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<User> getUsers() {
		try {
			return userServiceImp.requestUsers();
		} catch (Exception e) {
			System.out.println("there're no users. " + e);
		}
		return null;
	}
}
