package shoppingCart.api;

import java.util.concurrent.atomic.AtomicInteger;

public class User {

	private String userName;
	private String password;
	private int userID;
	
	private static final AtomicInteger count = new AtomicInteger(0);
		
	public User(String user, String password) {
		this.userName = user;
		this.password = password;
	}

	public void getNextId(){
		this.userID = count.incrementAndGet();
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUser(String user) {
		this.userName = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserID() {
		return userID;
	}
	
	public void setUserID(int userID) {
		this.userID = userID;
	}


}
