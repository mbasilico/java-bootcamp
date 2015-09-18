import java.util.ArrayList;
import java.util.List;

public class Transaction {
	
	private double total;
	
	public void selectProduct(List<Product> items){
		// calculate total from array, save into the variable total
		// insert array into Order table
		System.out.println("Items in cart: ");  // show array list
		for (Product product : items) {
	         System.out.println("Product: [ID : " + product.getProductId() + ", Name : " + product.getDescp()+ ", Price : " + product.getPrice() +" ]");}
		
	        }
	}
	
	public double getTotal(){
		return total;
	}
	
	public void addDiscount(double total){
		
		// insert new total into Transact table
	}
	

}
