package shoppingcart.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
@Table(name="transaction")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private long transactionID;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "amount")
	private double amount;
	
	@Autowired
	@OneToMany(cascade = CascadeType.PERSIST)
	private List<Item> items;
	
	public Transaction(double amount, List<Item> items) {
		this.date = new Date();
		this.items = items;
		this.amount = amount;
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

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getIDTransaction() {
		return transactionID;
	}

	public String showTransaction() {
		return "Transaction N " + this.getIDTransaction() + " made in: " + this.getDate() + " for:$ " + this.getAmount()+" items: "+ this.getItems();
	}

}
