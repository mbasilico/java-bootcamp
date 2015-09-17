package exercices.topic1.ex1;

import java.util.ArrayList;
import java.util.Observable;

public class ShoppingCart extends Observable {

	private ArrayList<Item> items;
	private Transaction t;

	public ShoppingCart() {
		items = new ArrayList<Item>();
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public void deleteItem(Item i) {
		items.remove(i);
	}

	public void addItem(Item i) {
		items.add(i);
	}
	
	public void NewTransaction(float amount, ArrayList<Item> items){
		this.t = new Transaction(amount,items);
		TransactionMade(t);
	}

	private void TransactionMade(Transaction t) {
		this.setChanged();
		notifyObservers("new transaction added with id " + t.getIDTransaction());

	}
	
}
