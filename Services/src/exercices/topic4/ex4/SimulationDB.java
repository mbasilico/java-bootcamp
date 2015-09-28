package exercices.topic4.ex4;

import java.util.HashMap;
import java.util.List;

public class SimulationDB {

	private HashMap<Integer, User> users;
	private static SimulationDB instance = new SimulationDB();

	private SimulationDB() {
		users = new HashMap<Integer, User>();
	}

	public static SimulationDB getinstance() {
		return instance;
	}

	public void addUser(User u) {
		users.put(u.getId(), u);
	}

	public User getUser(int id) {
		return users.get(id);
	}

	public void deleteUser(User user) {
		users.remove(user.getId());
	}

	public void modifyUser(User u) {
		users.remove(u.getId());
		users.put(u.getId(), u);
	}

	public List<User> getAllUsers() {
		return (List<User>) users.values();
	}

}
