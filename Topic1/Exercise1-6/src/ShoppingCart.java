import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private Transaction t;
	private List<Product> items;
	
	
	public void getList(){
		// show rows of Product table;
		}
	
	public void addToCart(List<Product> items){
		t= new Transaction();
		t.selectProduct(items);
		
	}
	
	public void payOrder(String paytype, List<Product> items) throws Exception{ // Exceptions can be handle with try and catch blocks.
		
		double total = t.getTotal(); // get the total price of the order
		
		String className = paytype; // represents the type of payment selected
		
		Class cl = Class.forName(className);
		Constructor tc = cl.getConstructor(double.class, List.class);
		Object t = tc.newInstance(total, items); // create a new instance of (CreditCard/PayPal/Cash) discount class depending on the content of paytype variable.
		
	}
	
	
	
	

}
