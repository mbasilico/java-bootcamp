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
import com.shopping.cart.service.CartService;
import com.shopping.cart.service.ProductService;


@RestController
@RequestMapping ("/shopcart")
public class CartController {
	@Autowired
	private CartService cartService;
	@Autowired
	private ProductService pService;
	private List<Product> cart=new ArrayList<Product>();
	
	public CartController(){}

	
	@RequestMapping(value="/add/{id}", method = RequestMethod.GET,headers="Accept=application/json")
	public String toCart(@PathVariable int id){
		cart.add(pService.getProduct(id).get(0));
		return "Added to Cart"; //fill the cart
	}
	
	@RequestMapping(value="/list", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Product> listCart(){
		return cart;
		
	}
	
	@RequestMapping(value="/paid/{pay}", method = RequestMethod.GET,headers="Accept=application/json")
	public void payMyCart(@PathVariable String pay) throws Exception{
		
		Integer orderId=addOrder();
		addTransac(pay,orderId);
	}
	
	@RequestMapping(value="/order", method = RequestMethod.GET,headers="Accept=application/json")
	public List<Order> getOrders(){
		return cartService.getAllOrders();
	}
			
	public int addOrder(){
		
		List<Product> p=new ArrayList<Product>();
		p=listCart();
		
		Iterator<Product> iterator = p.iterator();
		Order order1=new Order();
		while(iterator.hasNext()){ 
			order1.getProducts().add(iterator.next());
		}
		cartService.addOrder(order1);
		return order1.getOrderId();
	}
	
		
	public void addTransac(String paytype,Integer orderId) throws Exception{
			
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName(); //get logged username
		double t=cartService.payTheCart(paytype, cart);
		Date d=new Date();
		Transaction transaction= new Transaction(orderId,name,t,d);
		cartService.addTr(transaction);
	}
	

}
