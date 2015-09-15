package exercices.topic1.ex1;

public class Transaction {
	private PaymentStrategy payment;
	private float amount;
	private static int uniqueTransactionID = 0;
	private int TransactionID;

	public Transaction(PaymentStrategy payment, float amount) {
		this.payment = payment;
		this.amount = amount;
		this.TransactionID = getNextIDTransaction();
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

	private int getNextIDTransaction() {
		return uniqueTransactionID++;
	}

	public int getIDTransaction() {
		return TransactionID;
	}

}
