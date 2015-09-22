package exercises.one.client;

public abstract class ClientBuilder extends Client {

	protected Client client;

	public void createNewClient() {
		client = new Client();
	}

	public Client getClient() {
		return client;
	}

	public abstract void buildName();

	public abstract void buildClientID();

	public abstract void buildPassword();

	public abstract void buildShipingAdress();

}
