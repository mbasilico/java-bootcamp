package exercices.topic1.ex1;

import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {
	private PaymentStrategy payment;
	private float amount;
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int transactionID;

	public Transaction(PaymentStrategy payment, float amount) {
		this.payment = payment;
		this.amount = amount;
		this.transactionID = count.incrementAndGet();
	}

	public PaymentStrategy getPayment() {
		return payment;
	}

	public void setPayment(PaymentStrategy payment) {
		this.payment = payment;
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

}
