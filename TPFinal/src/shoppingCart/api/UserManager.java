package shoppingCart.api;

import java.util.ArrayList;

public class UserManager {

	ArrayList<User> users = new ArrayList<User>();

	public ArrayList<User> getUsers() {
		return users;
	}

	public User getUser(User user){
		for (User u : users) {
			if ((u.getUserName().equals(user.getUserName())) && (u.getPassword().equals(user.getPassword()))) {
				return u;
			}
		}
		return null;
	}
	public boolean exists(User user) {
		for (User u : users) {
			if ((u.getUserName().equals(user.getUserName())) && (u.getPassword().equals(user.getPassword()))) {
				return true;
			}
		}
		return false;
	}
	
	public void addNewUser(User user) {
		if (exists(user)) {
			System.out.println("This User Name is already in our database");
		} else {
			user.getNextId();
			this.users.add(user);
		}
	}

	public void deleteUser(User user) {
		if (exists(user)) {
			this.users.remove(user);
		} else {
			System.out.println("This User Name is not in our database");
		}
	}

	public void updateUser(User user, User userToUp) {
		if (exists(user)) {
			user.setPassword(userToUp.getPassword());
			user.setUser(userToUp.getUserName());
		} else {
			System.out.println("This User Name is not in our database");
		}
	}

	public void listUsers(ArrayList<User> users) {
		for (User u : users) {
			System.out.println("Username: " + u.getUserName() + " pass: " + u.getPassword() + " id: " + u.getUserID());
		}
	}
}
