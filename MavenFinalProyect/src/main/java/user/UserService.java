package user;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {	
	
	private List<User> userList = new ArrayList<User>();

	public ArrayList<User> requestUsers() {
		return null;
	}

	public boolean userExist(User user) {
		return userList.contains(user.getUserName());
	}

	public boolean addNewUser(User newUser) {
		if (userExist(newUser)) {
			userList.add(newUser);
			return true;
		}
		return false;
	}

}
