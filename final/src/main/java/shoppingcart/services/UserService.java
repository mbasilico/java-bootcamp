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

	public String registerUser(String name, String pass) {
		if (!userExists(name, pass)) {
			User u = new User(name, pass);
			userDao.save(u);
			return "User " + u.getUserName() + " created succefully";
		} else {
			return "User already exists";
		}
	}

	public String loginUser(String name, String pass) {
		if (!this.userExists(name, pass)) {
			return "User not exists or data is not correct";
		} else {
			return "User loged";
		}
	}

	public ArrayList<User> showUsers() {
		return (ArrayList<User>) userDao.findAll();
	}

	public String deleteUser(Long id) {
		if (this.getUser(id) == null) {
			User u = new User();
			u = userDao.findOne(id);
			userDao.delete(id);
			return "User " + u.toString() + " deleted succefully";
		} else {
			return "Incorrect ID, user not exists";
		}
	}

	public User getUser(Long id) {
		return userDao.findOne(id);
	}

	public String logoutUser(Long id) {
		if (this.getUser(id) == null) {
			return "User not exists or data is not correct";
		} else {
			return "User loged out";
		}
	}

	private boolean userExists(String name, String pass) {
		User u = new User(null, null);
		u = userDao.findByNameAndPass(name, pass);
		if (u == null)
			return false;
		else
			return true;
	}

}
