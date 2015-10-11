package com.shopping.cart.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.cart.dao.TransactDao;
import com.shopping.cart.main.Transaction;

@Repository
public class TransactDaoImpl implements TransactDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void addTr(Transaction transaction) {
		sessionFactory.getCurrentSession().save(transaction);
		
		
		
	}

	
	

}
