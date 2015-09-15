package exercices.topic1.ex1;

import java.util.ArrayList;
import java.util.Observable;

public class ShoppingCart extends Observable{
	
	private ArrayList<Item> items;
	private PaymentStrategy payment;
	
	public ShoppingCart(){
		items = new ArrayList<Item>();
	}
	
	public void setPayment(PaymentStrategy payment){
		this.payment = payment;
	}
	
	public void deleteItem(Item i){
		items.remove(i);
	}
	
	public void addItem(Item i){
		items.add(i);
	}
	
	public Transaction buyItems(){
		float amount = payment.getDiscount().applyDiscount();
		payment.makePayment(amount);
		Transaction t = new Transaction(payment, amount);
		TransactionMade(t);
		return t;
	}

	private void TransactionMade(Transaction t) {
		this.setChanged();
		notifyObservers("new transaction added with id "+ t.getIDTransaction());
		
	}
}
