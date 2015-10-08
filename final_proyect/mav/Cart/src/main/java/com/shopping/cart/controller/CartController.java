package com.shopping.cart.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.cart.main.Order;
import com.shopping.cart.main.Product;
import com.shopping.cart.main.Transaction;
import com.shopping.cart.service.UserService;

@RestController
@RequestMapping ("/car")
public class CartController {
	@Autowired
	private UserService uservice;
	private List<Product> cart=new ArrayList<Product>();
	
	public CartController(){}

	
	@RequestMapping(value="/hib/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public String toCart(@PathVariable int id){
		cart.add(uservice.getProduct(id).get(0));
		return "Added to Cart"; //fill the cart
	}
	
	@RequestMapping(value="/hib/list", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Product> listCart(){
		return cart;
		
	}
	
	@RequestMapping(value="/hib/paid/{pay}", method = RequestMethod.GET,headers="Accept=application/json")
	public void payMyCart(@PathVariable String pay) throws Exception{
		
		Integer orderId=addOrder();
		addTransac(pay,orderId);
	}
	
	@RequestMapping(value="/order", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Order> getYourOrder(){
		return uservice.getAllOrders();
	}
			
	public int addOrder(){
		
		List<Product> p=new ArrayList<Product>();
		p=listCart();
		
		Iterator<Product> iterator = p.iterator();
		Order order1=new Order();
		while(iterator.hasNext()){ 
			order1.getProducts().add(iterator.next());
		}
		uservice.addOrder(order1);
		return order1.getOrderId();
	}
	
		
	public void addTransac(String paytype,Integer orderId) throws Exception{
			
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName(); //get logged in username
		double t=uservice.payTheCart(paytype, cart);
		Date d=new Date();
		Transaction transaction= new Transaction(orderId,name,t,d);
		uservice.addTr(transaction);
	}
	

}
