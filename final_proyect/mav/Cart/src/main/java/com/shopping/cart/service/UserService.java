package com.shopping.cart.service;

import java.util.List;

import com.shopping.cart.main.User;


public interface UserService {
	
	public boolean getUserLogin(String username, String password);
	public List<User> getAllUsers();
	public boolean getUserName(String username);
	public void newUser(User user);
}
