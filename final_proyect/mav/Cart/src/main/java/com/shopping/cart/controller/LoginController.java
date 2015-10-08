package com.shopping.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.cart.main.User;
import com.shopping.cart.service.UserService;

@RestController
@RequestMapping(value="/")
public class LoginController {
	@Autowired
    private UserService uService;
	
	@RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
	public String homePage (){
		return "Welcome to ShopCart";
		
	}
	@RequestMapping(value="/logoutUser",method = RequestMethod.GET)
	public String logout(){
		return "Logged Out";
		
	}
	
	@RequestMapping(value="/login",method = RequestMethod.GET,headers="Accept=application/json")
	public String userLogin(){
		return "Logged in";
	}
	
	@RequestMapping(value="/newuser/{username},{password},{role}",method = RequestMethod.GET,headers="Accept=application/json", produces={"application/json"})
	public String addUser(@PathVariable String username,@PathVariable String password,@PathVariable String role){
		
		if (!uService.getUserName(username))
			return "Username not available";
		else{
			User user=new User(username,password,role);
			uService.addUser(user);
			return "User registered";}
	}
	
	
	@RequestMapping(value="/logUser/{username},{password}",method = RequestMethod.GET,headers="Accept=application/json", produces={"application/json"})
	public String logUser(@PathVariable String username,@PathVariable String password){
		
		if(!uService.getUserLogin(username, password))
			return "Login Succesfully";
		else
			return "Login error";
		
	}
	
	
	
}
