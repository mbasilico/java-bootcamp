package client;

public class ClientDirector {

	private ClientBuilder clientBuilder;

	public void setClientBuilder(ClientBuilder cb) {
		clientBuilder = cb;
	}

	public Client getClient() {
		return clientBuilder.getClient();
	}

	public void constructClient() {
		clientBuilder.createNewClient();
		clientBuilder.buildName();
		clientBuilder.buildClientID();
		clientBuilder.buildPassword();
		clientBuilder.buildShipingAdress();
	}

}
