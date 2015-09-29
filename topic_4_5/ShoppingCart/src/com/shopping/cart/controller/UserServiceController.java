package com.shopping.cart.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.cart.Product;
import com.shopping.cart.UserService;


@RestController
@RequestMapping ("/product")
public class UserServiceController {
	
	UserService users=new UserService();
	@RequestMapping(method = RequestMethod.GET,headers="Accept=application/json")
	public List<Product> getAllProducts() {
		return users.showList();}
	
	@RequestMapping (value="/cart")
	public List<Product> getYourCart() {
		return users.showCart();}
	
	
	@RequestMapping(value="/cart/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public Product selectItem(@PathVariable int id) throws InterruptedException{
		return users.itemtoCart(id);
		
	}

	@RequestMapping(value="/cart/pay/{paid}", method = RequestMethod.GET,headers="Accept=application/json")
	public String payYourCart(@PathVariable String paid) throws Exception{
		return (users.payCart(paid));
	}
	
	
}
		