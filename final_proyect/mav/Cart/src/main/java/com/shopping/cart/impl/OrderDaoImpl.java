package com.shopping.cart.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.cart.dao.OrderDao;
import com.shopping.cart.main.Order;

@Repository
public class OrderDaoImpl implements OrderDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Order> getAllOrders() {
		
		return sessionFactory.getCurrentSession().createQuery("from Order").list();
	}

	@Override
	public void addOrder(Order order) {
		sessionFactory.getCurrentSession().save(order);
		
	}

}
