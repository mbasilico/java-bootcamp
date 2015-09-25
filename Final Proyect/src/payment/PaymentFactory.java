package payment;

import java.util.Scanner;

import client.Client;
import shoppingCart.ShoppingCart;

public class PaymentFactory {

	public static void getPayment(ShoppingCart cart, Client client) {

		Scanner input = new Scanner(System.in);
		System.out.println("choose type of payment /cash/credit/paypal");
		String type = input.nextLine();

		switch (type) {
		case "paypal":
			System.out.println("paypal payment");
			new Paypal().payWith(cart, client);
			input.close();
			return;
		case "credit":
			System.out.println("credit payment");
			new CreditCard().payWith(cart, client);
			input.close();
			return;
		case "cash":
			System.out.println("cash payment");
			new Cash().payWith(cart, client);
			input.close();
			return;
		default:
			System.out.println("wrong option, try again please...");
			input.close();
			return;
		}

	}
}
