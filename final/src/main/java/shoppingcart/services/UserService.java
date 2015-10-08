package shoppingcart.services;


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
		if (userDao.findAll().contains(u))
			return "user already in db";
		else{
			userDao.add(u);
			
		}
		return null;
	}

	public String loginUser(User u) {
		if (userDao.findAll().contains(u))
			return "User loged";
		else
			return "User not in DB please login or register";
	}

	public List<User> showUsers() {
		return userDao.findAll();
	}

	public String deleteUser(User u) {
		if (userDao.findAll().contains(u)){
			userDao.delete(u);
			return "User "+u.toString()+ " deleted succefully";
		}else
			return "User not in DB please login or register";
	}
	
	public User getUser (Long id){
		return userDao.findById(id);
	}

}
