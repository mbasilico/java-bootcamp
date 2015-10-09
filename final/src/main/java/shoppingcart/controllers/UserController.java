package shoppingcart.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	public void regUser(@RequestParam String name, @RequestParam String pass){
		User u = new User(name,pass);
		service.registerUser(u);
	}
	
	@RequestMapping (value="/login", method= RequestMethod.POST)
	public void logUser(@RequestParam String name, @RequestParam String pass){
		User u = new User(name,pass);
		service.loginUser(u);
	}
	
	@RequestMapping (value="/", method= RequestMethod.GET)
	public List<User> showUser(){
		return (List<User>) service.showUsers();
	}
	
	@RequestMapping (value="/{id}", method= RequestMethod.GET)
	public User getUser(@PathVariable Long id) {
			return service.getUser(id);
	
	}
	
	@RequestMapping (value="/{id}", method= RequestMethod.DELETE)
	public void delUser(@PathVariable Long id){
		service.deleteUser(id);
	}
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
    public String index() {
        return "User Controller - Greetings from Spring Boot!";
	}
	
}
