import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Transaction {
	
	private Lock lock=new Lock();
	private int transacId;
	private double total;
	private int clientId;
	private Date day;
	private int orderId;
	List<Integer> ordid = new ArrayList<Integer>();
	
	
	public void selectProduct(List<Product> items) throws InterruptedException{
		
		System.out.println("Items in cart: ");

		for (Product product : items) {
	         System.out.println("Product: [ID : " + product.getProductId() + ", Name : " + product.getDescp()+ ", Price : " + product.getPrice() +" ]"); // show array list
	         total = total+product.getPrice(); // calculate total from array, save into the variable total
	         ordid.add(product.getProductId());
	         
		}    
			 
		lock.lock();
		//sql query to get the last orderId from Order table. Save result into orderId variable.
		++orderId;
		// insert orderId (from orderId variable),ProductId(from ordid array) into Order table.
		lock.unlock();
		 
		
		 /* The Order table contains all products associated with each order
	          * [orderId		  ProductId]
	          * 	1			2
	          * 	1			3
	          * 	2			5
	          * 	2			9
	          */
	     
		System.out.println("Total to pay : "+ total);
		
	}
	
	public double getTotal(){
		return total;
	}
	
	public void addDiscount(double total) throws InterruptedException{
		
		
		// insert a new row into Transact table. The transacId is the counter of transactions.
		
		
		/* The Transact table contains all the transactions made. Each transaction is associated with one orderId
		 * [transacId	orderId		date		clientId	Total(with discount)
		 * 	1	1		dd/mm/yyyy		4			456
		 * 	2	4		dd/mm/yyyy		6			100
		 * 	3	2		dd/mm/yyyy		1			45
		 */
	
		ItemManager itemman = new ItemManager("New Transaction",clientId,day,orderId,total);
	
	}
	
}
