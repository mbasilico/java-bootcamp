package shoppingcart.services;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shoppingcart.DAO.UserDAO;
import shoppingcart.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDao;
	
	
	public String registerUser(User u) {
		if (((List<User>) userDao.findAll()).contains(u))
			return "user already in db";
		else{
			userDao.save(u);
			
		}
		return null;
	}

	public String loginUser(User u) {
		if (((List<User>) userDao.findAll()).contains(u))
			return "User loged";
		else
			return "User not in DB please login or register";
	}

	public ArrayList<User> showUsers() {
		return (ArrayList<User>) userDao.findAll();
	}

	public String deleteUser(Long id) {
		User u= new User();
		u=userDao.findOne(id);
		userDao.delete(id);
			return "User "+u.toString()+ " deleted succefully";
	}

	public User getUser(Long id) {
		return userDao.findOne(id);
	}

	
}
