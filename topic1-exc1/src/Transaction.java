import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {
	private Date date;
	private static final AtomicInteger count = new AtomicInteger(0);
	private final int transactionID;
	private ArrayList<Items> items;
	
	public Transaction(ArrayList<Items> items) {
		this.date = new Date();
		this.items = items;
		this.transactionID = count.incrementAndGet();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = new Date();
	}

	public ArrayList<Items> getItems() {
		return items;
	}

	public void setItems(ArrayList<Items> items) {
		this.items = items;
	}

	public int getIDTransaction() {
		return transactionID;
	}

	public void printTransaction() {
		 ListIterator<Items> it = items.listIterator();
		 Items x = null;
		 double tot = 0;
		 System.out.println("-Transaction N° " + this.getIDTransaction() + "\n-Date: " + this.getDate()+ "\n-Items:" );
	     while(it.hasNext())
			 {x = it.next();
			  System.out.println(x.getName() );
			  tot = x.getPrice() + tot;}
			 System.out.println("-Total : " + tot); 
}
}