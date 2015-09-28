package client;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private String clientID;
	private String password;
	private String shippingAdress;
	private List<Client> clients = new ArrayList<Client>();

	@Override
	public String toString() {
		return "Client [Name= " + name + ", ClientID= " + clientID + ", Shipping Adress= " + shippingAdress + "]";
	}
	
	public synchronized void addClient(Client client){
		this.clients.add(client);
	}

	public synchronized Client getClient(String name, String password) {
		for (Client client : this.clients) {
			if (client.getName() == name && client.getPassword() == password) {
				return client;
			}
		}
		return null;
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
