package com.shopping.cart.service;

import java.util.List;

import com.shopping.cart.main.Order;
import com.shopping.cart.main.Product;
import com.shopping.cart.main.Transaction;
import com.shopping.cart.main.User;


public interface UserService {
	
	public List<Product> getAllProducts();
	public List<Product> getProductList();
	public void deleteProduct(int productId);
	public void addProduct(Product product);
	public List<Order> getAllOrders();
	public void addOrder(Order order);
	public List<Product> getProduct(int productId);
	public void addTr(Transaction transaction);
	public double payTheCart(String pay, List<Product> cart) throws Exception;
	public void addUser(User user);
	public boolean getUserLogin(String username, String password);
	public List<User> getAllUsers();
	public boolean getUserName(String username);
	public List<Product> searchName(String name);
}
