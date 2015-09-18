import java.util.ArrayList;
import java.util.List;

public class Transaction {
	
	private double total;
	
	public void selectProduct(List<Product> items){
		
		// insert array into Order database table
		
		System.out.println("Items in cart: ");
		for (Product product : items) {
	             System.out.println("Product: [ID : " + product.getProductId() + ", Name : " + product.getDescp()+ ", Price : " + product.getPrice() +" ]"); // show list of items in cart
	             total = total+product.getPrice(); // calculate total from array, save into the variable total	
		}
	        System.out.println("Total to pay : "+ total);
	}
	
	public double getTotal(){
		return total;
	}
	
	public void addDiscount(double total){
		
		// insert new total into Transact table
	}
	

}
