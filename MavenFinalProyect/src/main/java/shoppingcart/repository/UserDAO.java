package shoppingcart.repository;

import java.util.List;

import shoppingcart.model.User;

public interface UserDAO {
	
	public List<User> userList();
    
    public User getUser(Long id);
     
    public void saveOrUpdateUser(User user);
     
    public void deleteUser(Long id);
    
    public User findByName(String name);

}
