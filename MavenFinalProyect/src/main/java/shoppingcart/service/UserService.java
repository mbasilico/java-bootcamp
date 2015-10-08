package shoppingcart.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.springframework.stereotype.Service;

import shoppingcart.model.User;
import shoppingcart.repository.UserDAOImp;

@Service
public class UserService {

	UserDAOImp userDAOImp;

	@OneToMany(mappedBy = "userName", fetch = FetchType.LAZY)
	private List<User> userList = new ArrayList<User>();

	public List<User> requestUsers() {
//		userDAOImp.
		return userDAOImp.userList();
	}
	
	public User findById(Long id){
		User user = userDAOImp.getUser(id);
		return user;
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
	
	public User loginGetUser(String userName, String userPassword){
		User user = new User();
		
		// find out how to do it
		user.setUserName(userName);
		return user;
	}

}
