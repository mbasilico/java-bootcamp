package com.shopping.cart.dao;

import java.util.List;

import com.shopping.cart.main.Order;

public interface OrderDao {
	public List<Order> getAllOrders();
	public void addOrder(Order order);

}
