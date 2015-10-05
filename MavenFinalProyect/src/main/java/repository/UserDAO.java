package repository;

import java.util.List;

import model.User;

public interface UserDAO {
	
	public List<User> userList();
    
    public User getUser(int id);
     
    public void saveOrUpdateUser(User user);
     
    public void deleteUser(int id);

}
