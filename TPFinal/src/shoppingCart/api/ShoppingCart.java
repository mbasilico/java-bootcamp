package shoppingCart.api;

import java.util.ArrayList;
import java.util.Observable;

public class ShoppingCart extends Observable {
	
	private String name;
	private ItemsManager itemM;
	private ArrayList<Item> items = new ArrayList<Item>();
	private Transaction t;

	public ShoppingCart(String name) {
		 this.itemM = new  ItemsManager(items);
		 this.setName(name);
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = itemM.getItems();
	}

	public void deleteItem(int i) {
		itemM.RemoveItem(i);
	}

	public void addItem(Item i) {
		itemM.addItem(i);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void NewTransaction(float amount, ArrayList<Item> items){
		this.t = new Transaction(amount,items);
		TransactionMade(t);
	}

	private void TransactionMade(Transaction t) {
		this.setChanged();
		notifyObservers("new transaction added with id " + t.getIDTransaction());

	}
	
	public float pay(PaymentStrategy paymentMethod){
		return paymentMethod.makePayment(this.itemM.getItems());
	}

	
}
