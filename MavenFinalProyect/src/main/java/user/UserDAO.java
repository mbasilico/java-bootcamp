package user;

import java.util.ArrayList;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

	public void saveUser(User user) {
		// some code to save user in the DB
	}

	public User getUser(int userID) {
		// some code to get a user from the DB
		User user = new User();
		return user;
	}
	
	public ArrayList<User> getUserList(){
		
		// some code to get the list of users from the DB
		ArrayList<User> userList = new ArrayList<User>();
		return userList;
	}

}
