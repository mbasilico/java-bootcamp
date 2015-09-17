package exercices.topic1.ex1;

import java.util.ArrayList;
import java.util.Observable;

public class ShoppingCart extends Observable {

	private ArrayList<Item> items;

	public ShoppingCart() {
		items = new ArrayList<Item>();
	}

	public void deleteItem(Item i) {
		items.remove(i);
	}

	public void addItem(Item i) {
		items.add(i);
	}

	public Transaction buyItems() {
		String amount = payment.makePayment(items);
		Transaction t = new Transaction(payment, amount);
		TransactionMade(t);
		return t;
	}

	private void TransactionMade(Transaction t) {
		this.setChanged();
		notifyObservers("new transaction added with id " + t.getIDTransaction());

	}
}
