package user;

import java.util.List;

public interface UserDAO {
	
	public List<User> userList();
    
    public User getUser(int id);
     
    public void saveOrUpdateUser(User user);
     
    public void deleteUser(int id);

}
