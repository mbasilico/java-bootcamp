package payment;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import client.Client;
import product.Product;
import shoppingCart.ShoppingCart;

public class Transaction {

	private String clientName;
	private String clientID;
	private Date date;
	private double totalPayed;
	private List<Product> shoppingList;

	protected Transaction() {
	}

	public synchronized void newTransaction(ShoppingCart cart, Client client, double total) {
		this.clientName = client.getName();
		this.clientID = client.getClientID();
		this.totalPayed = total;
		this.shoppingList = cart.getCart();

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		// get current date time with Date()
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		this.date = date;
	}

	protected synchronized Transaction getTransaction(ShoppingCart cart, Client client, double total) {
		Transaction t = new Transaction();
		t.newTransaction(cart, client, total);
		return t;
	}

}
