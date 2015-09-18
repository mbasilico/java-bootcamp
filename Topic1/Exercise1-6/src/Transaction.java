import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Transaction {
	
	private int transacId;
	private double total;
	private int clientId;
	private Date day;
	private int orderId;
	
	public void selectProduct(List<Product> items){
		
		// insert array into Order table (orderId,productId)
		
		
		System.out.println("Items in cart: ");
		
		for (Product product : items) {
	         System.out.println("Product: [ID : " + product.getProductId() + ", Name : " + product.getDescp()+ ", Price : " + product.getPrice() +" ]"); // show array list
	         total = total+product.getPrice(); // calculate total from array, save into the variable total
		}
		System.out.println("Total to pay : "+ total);
		
	    }
	
	
	public double getTotal(){
		return total;
	}
	
	public void addDiscount(double total){
		
		ItemManager itemman = new ItemManager("New Transaction",clientId,day,orderId,total);
		
		// insert new total into Transact table. The transacId is the counter of transactions.
	}
	

}
