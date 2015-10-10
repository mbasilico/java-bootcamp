package com.shopping.cart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
		return "Logged in";// using Spring security framework
	}
	
	
	@RequestMapping(value="/reguser",method = RequestMethod.POST,headers="Accept=application/json", produces={"application/json"})
	public @ResponseBody User createUser(@RequestBody User user) {
		
		if (!uService.getUserName(user.getUsername()))
			return null; //username already exists
		else{
			uService.newUser(user);
			return user;}
	}
	
	
	@RequestMapping(value="/logUser/{username},{password}",method = RequestMethod.GET,headers="Accept=application/json", produces={"application/json"})
	
	public String logUser(@PathVariable String username, @PathVariable String password){
		
		if(!uService.getUserLogin(username, password)) // without Spring security framework 
			return "Login Succesfully";
		else
			return "Login error";
		
	}
	
	
	
}
