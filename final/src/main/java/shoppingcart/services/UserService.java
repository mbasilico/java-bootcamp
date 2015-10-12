package shoppingcart.services;


import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shoppingcart.DAO.UserDAO;
import shoppingcart.model.User;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDao;
	
	
	public void registerUser(String name, String pass) {
		if (!userExists(name, pass)){
			User u = new User(name,pass);
			userDao.save(u);
		}
	}

	public String loginUser(String name, String pass) {
		if (!this.userExists(name, pass)){
			return "User loged";
		}
		else{
			return "User not exists or data is not correct";
		}
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

	public void logoutUser(Long id) {
		User u = userDao.findOne(id);
		userDao.save(u);
		
	}
	
	private boolean userExists(String name, String pass){
		User u = new User(null,null);
		u=userDao.findByNameAndPass(name, pass);
		if (u==null)
			return false;
		else
			return true;
	}

	
}
