package client;

import java.util.Scanner;

public class ConsoleClientBuilder extends ClientBuilder {

	Scanner input = new Scanner(System.in);

	@Override
	public void buildName() {
		System.out.print("Enter name of the client: ");
		client.setName(input.nextLine());
	}

	@Override
	public void buildClientID() {
		System.out.print("Enter client ID: ");
		client.setClientID(input.nextLine());
	}

	@Override
	public void buildPassword() {
		System.out.print("Enter password of the client: ");
		client.setPassword(input.nextLine());
	}

	@Override
	public void buildShipingAdress() {
		System.out.print("Enter shipping adress of the client: ");
		client.setShippingAdress(input.nextLine());
	}

}
