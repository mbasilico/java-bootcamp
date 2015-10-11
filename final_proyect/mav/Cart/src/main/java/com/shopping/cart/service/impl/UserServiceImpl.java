package com.shopping.cart.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.cart.dao.UserDao;
import com.shopping.cart.main.User;
import com.shopping.cart.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	

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
	public void newUser(User user) {
		userDao.newUser(user);
		
	}

}
