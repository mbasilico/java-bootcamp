package com.shopping.cart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.cart.dao.OrderDao;
import com.shopping.cart.dao.TransactDao;
import com.shopping.cart.main.Order;
import com.shopping.cart.main.Product;
import com.shopping.cart.main.ShoppingCart;
import com.shopping.cart.main.Transaction;
import com.shopping.cart.service.CartService;

@Service
public class CartServiceImpl implements CartService{
	
	@Autowired
	private OrderDao orderDao;
	@Autowired
	private TransactDao trDao;
	@Autowired
	private ShoppingCart shopCart;

	@Transactional
	public void addOrder(Order order) {
		orderDao.addOrder(order);
		
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
	public List<Order> getAllOrders() {
		
		return orderDao.getAllOrders();
	}
}
