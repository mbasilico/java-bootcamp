package com.shopping.cart.dao;

import java.util.List;

import com.shopping.cart.main.User;

public interface UserDao {
	public List<User> getAllUsers();
	public List<User> getUser(int idUser);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int idUser);
	public boolean getUserName(String username);
	public boolean getUserLogin(String username, String password);
}
