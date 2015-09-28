package exercices.topic4.ex4;

import java.util.List;

public class UserServicePersisted implements UserService{
	
	private SimulationDB db = SimulationDB.getinstance();
		
		public void addUser(User u) {
			db.addUser(u);
		}

		public void deleteUser(int id) {
			db.deleteUser(db.getUser(id));
			
		}

		public User getUser(int id) {
			return db.getUser(id);
		}

		public void updateUser(User u) {
			db.modifyUser(u);
			
		}

		public List<User> getAllUsers() {
			return db.getAllUsers();
		}

}
