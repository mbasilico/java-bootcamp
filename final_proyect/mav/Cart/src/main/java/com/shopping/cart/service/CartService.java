package com.shopping.cart.service;

import java.util.List;

import com.shopping.cart.main.Order;
import com.shopping.cart.main.Product;
import com.shopping.cart.main.Transaction;

public interface CartService {
	
	public void addOrder(Order order);
	public void addTr(Transaction transaction);
	public double payTheCart(String pay, List<Product> cart) throws Exception;
	public List<Order> getAllOrders();
}
