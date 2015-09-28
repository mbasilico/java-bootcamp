package exercices.topic4.ex4;

import java.util.List;

public interface UserService {

	public void addUser(User u);

	public void deleteUser(int id);

	public User getUser(int id);

	public void updateUser(User u);

	public List<User> getAllUsers();

}
