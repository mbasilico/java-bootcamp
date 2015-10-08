package com.shopping.cart.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.cart.dao.OrderDao;
import com.shopping.cart.dao.ProductDao;
import com.shopping.cart.dao.TransactDao;
import com.shopping.cart.dao.UserDao;
import com.shopping.cart.main.Order;
import com.shopping.cart.main.Product;
import com.shopping.cart.main.ShoppingCart;
import com.shopping.cart.main.Transaction;
import com.shopping.cart.main.User;
import com.shopping.cart.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private ProductDao productDao;
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private TransactDao trDao;
	@Autowired
	private ShoppingCart shopCart;
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public List<Product> getAllProducts() {
		
		return productDao.getAllProducts();
	}


	@Transactional
	public void deleteProduct(int productId) {
		productDao.deleteProduct(productId);
		
	}


	@Transactional
	public void addProduct(Product product) {
		productDao.addProduct(product);
	}



	@Transactional
	public List<Order> getAllOrders() {
		
		return orderDao.getAllOrders();
	}



	@Transactional
	public void addOrder(Order order) {
		orderDao.addOrder(order);
		
	}

	
	@Transactional
	public List<Product> getProduct(int productId) {
		
		return productDao.getProduct(productId);
	}

	
	

	
	@Transactional
	public void addTr(Transaction transaction) {
		trDao.addTr(transaction);
	}

	
	@Override
	public double payTheCart(String pay, List<Product> cart) throws Exception {
		return shopCart.payOrder(pay,cart);
	}


	@Transactional
	public List<Product> getProductList() {
		
		return productDao.getAllProducts();
	}


	@Transactional
	public void addUser(User user) {
		userDao.addUser(user);
		
	}


	@Transactional
	public boolean getUserLogin(String username, String password) {
		return userDao.getUserLogin(username, password);
		
	}


	@Transactional
	public List<User> getAllUsers() {
		
		return userDao.getAllUsers();
	}


	@Transactional
	public boolean getUserName(String username) {
		
		return userDao.getUserName(username);
	}


	@Transactional
	public List<Product> searchName(String name)  {
		
		
		
		
		
		return productDao.searchName(name);
	}

}
