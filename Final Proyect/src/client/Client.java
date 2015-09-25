package client;

public class Client {

	private String name;
	private String clientID;
	private String password;
	private String shippingAdress;

	@Override
	public String toString() {
		return "Client [Name= " + name + ", ClientID= " + clientID + ", Shipping Adress= " + shippingAdress + "]";
	}

	public String getName() {
		return name;
	}

	public String getClientID() {
		return clientID;
	}

	public String getPassword() {
		return password;
	}

	public String getShippingAdress() {
		return shippingAdress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setClientID(String clientID) {
		this.clientID = clientID;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setShippingAdress(String shippingAdress) {
		this.shippingAdress = shippingAdress;
	}

}
