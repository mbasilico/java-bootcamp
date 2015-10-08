package shoppingcart.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import shoppingcart.model.User;
import shoppingcart.services.UserService;



@RestController
@RequestMapping("/api/user")
@EnableAutoConfiguration
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping (value="/register", method= RequestMethod.POST)
	public void regUser(@RequestBody String name, String pass){
		User u = new User();
		u.setUser(name);
		u.setPassword(pass);
		service.registerUser(u);
	}
	
	@RequestMapping (value="/login", method= RequestMethod.POST)
	public void logUser(User u){
		service.loginUser(u);
	}
	
	@RequestMapping (value="/", method= RequestMethod.GET)
	public List<User> showUser(){
		return service.showUsers();
	}
	
	@RequestMapping (value="/{userID}", method= RequestMethod.DELETE)
	public void delUser(@PathVariable User u){
		service.deleteUser(u);
	}
	
	@RequestMapping (value="/{userID}", method= RequestMethod.GET)
	public User getUser(@PathVariable Long userID){
		return service.getUser(userID);
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String index() {
        return "Cart Controller - Greetings from Spring Boot!";
	}
	
}
