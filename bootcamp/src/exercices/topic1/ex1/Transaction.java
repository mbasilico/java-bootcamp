package exercices.topic1.ex1;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {
	private Date date;
	private List<Item> items;
	private float amount;
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int transactionID;

	public Transaction(float amount, List<Item> items) {
		this.date = new Date();
		this.items = items;
		this.amount = amount;
		this.transactionID = count.incrementAndGet();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = new Date();
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getIDTransaction() {
		return transactionID;
	}

	public String showTransaction() {
		return "Transaction N " + this.getIDTransaction() + " made in: " + this.getDate() + " for:$ " + this.getAmount()+" items: "+ this.getItems();
	}

}
