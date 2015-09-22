import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private Transaction t;
	private List<Product> items = new ArrayList<Product>();
	
	
	public void getList(){
		// show all rows of Product table;
		}
	
	public void addToCart(int id,String descp,double price) throws InterruptedException{
		
		items.add(new Product(id,descp,price));
		System.out.println("[ID : " + id + ", Name : " + descp + ", Price : " + price +" ]");
	}
	
	public void payOrder(String paytype) throws Exception{ //Exceptions can be handle with try and catch blocks.
		
		t= new Transaction();
		t.selectedProducts(items);
		
		double total = t.getTotal(); // get the total price of the order
		
		
		String className = paytype; // represents the type of payment selected
		
		Class cl = Class.forName(className);
		Constructor tc = cl.getConstructor(double.class,List.class);
		Object t = tc.newInstance(total,items); // create a new instance of (CreditCard/PayPal/Cash) discount class depending on the content of paytype variable.
		
	}
	
	
}
