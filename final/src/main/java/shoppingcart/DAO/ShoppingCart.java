package shoppingcart.DAO;

import java.util.ArrayList;
import java.util.Observable;

import org.springframework.stereotype.Repository;

import shoppingcart.model.Item;
import shoppingcart.model.PaymentStrategy;
import shoppingcart.model.Transaction;

@Repository
public class ShoppingCart extends Observable {
	
	private Integer cartId;
	private ItemsManager itemM;
	private ArrayList<Item> items = new ArrayList<Item>();
	private Transaction t;

	
	public ShoppingCart() {
		 this.itemM = new  ItemsManager(items);
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
	
	public Integer getName() {
		return cartId;
	}

	public void setName(Integer cartId) {
		this.cartId = cartId;
	}

	public void NewTransaction(float amount, ArrayList<Item> items){
		this.t = new Transaction(amount,items);
		TransactionMade(t);
	}

	private void TransactionMade(Transaction t) {
		this.setChanged();
		notifyObservers("new transaction added with id " + t.getIDTransaction());

	}
	
	public double pay(PaymentStrategy paymentMethod){
		return paymentMethod.makePayment(this.itemM.getItems());
	}

	
}
