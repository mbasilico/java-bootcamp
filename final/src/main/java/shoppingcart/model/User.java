package shoppingcart.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "userID", nullable = false)
	private Long userID;
	
	@Column(name = "userName", nullable = false)
	private String userName;
	
	@Column(name = "password", nullable = false)
	private String password;

	
	public User() {
	}
	
	public User(String user, String password) {
		this.userName = user;
		this.password = password;
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

	public Long getUserID() {
		return userID;
	}

	public void setUserID(Long userID) {
		this.userID = userID;
	}

}
