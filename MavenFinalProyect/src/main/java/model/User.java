package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "userID", nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;

	@Column(name = "userName", nullable = false)
	@Size(max = 30)
	private String userName;

	@Column(name = "userPassword", nullable = false)
	@Size(max = 30)
	private String userPassword;

	@Column(name = "userShippingAdress", nullable = false)
	private String userShippingAdress;
	
	public User() {		
	}

	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public String getUserShippingAdress() {
		return userShippingAdress;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public void setUserShippingAdress(String userShippingAdress) {
		this.userShippingAdress = userShippingAdress;
	}
}
