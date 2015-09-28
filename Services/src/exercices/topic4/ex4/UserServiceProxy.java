package exercices.topic4.ex4;

import java.util.List;

public class UserServiceProxy implements UserService {
	UserService implementation;

	protected UserServiceProxy(UserService imp) {
		this.implementation = imp;
	}

	@Override
	public void addUser(User u) {
		implementation.addUser(u);
	}

	@Override
	public void deleteUser(int id) {
		implementation.deleteUser(id);
	}

	@Override
	public User getUser(int id) {
		return implementation.getUser(id);
	}

	@Override
	public void updateUser(User u) {
		implementation.updateUser(u);
	}

	@Override
	public List<User> getAllUsers() {
		return implementation.getAllUsers();
	}

}
