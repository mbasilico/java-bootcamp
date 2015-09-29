package com.shopping.cart;

import java.util.List;

public class UserService {
	
	private ShoppingCart cart=new ShoppingCart();
	
	public List<Product> showList(){
		return cart.getList();
	}
	
	public List<Product> showCart(){
		return cart.getCart();
	}
	
	public Product itemtoCart(int id) throws InterruptedException{
		return cart.addToCart(id);
	}
	
	public String payCart(String discount) throws Exception{
		return cart.payOrder(discount);
		
	}
	
	

}
