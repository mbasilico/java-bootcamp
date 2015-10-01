package user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@Column(name = "userID", nullable = false)
	private String userID;

	@Column(name = "userName", nullable = false)
	private String userName;

	@Column(name = "userPassword", nullable = false)
	private String userPassword;

	@Column(name = "userShippingAdress", nullable = false)
	private String userShippingAdress;

	public String getUserID() {
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

	public void setUserID(String userID) {
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
