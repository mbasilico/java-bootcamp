import java.lang.reflect.*;

public class ShoppingCart {
	
	Order order = new Order();
	
	public void createOrder(){
		order.addToCart();
		order.placeNewOrder();
		
	}
	
	public void payOrder(String paytype) throws Exception{ //Exceptions can be handle with try and catch blocks.
		
		int orderId = order.getOrder(); // get the order Id that identify a unique order
		double total = order.getTotal(); // get the total price of the order
		
		String className = paytype; // represents the type of payment selected
		
		Class cl = Class.forName(className);
		Constructor tc = cl.getConstructor(int.class, double.class);
		Object t = tc.newInstance(1, 350); // create a new instance of (CreditCard/PayPal/Cash) discount class depending on the content of paytype variable.
						   // for demostration purposes, we assume that OrderId=1 and Total=350	
			
	}
	
	
	public void getProducts(){ 
		 // show all products (connection to database)
		}
	
	public void getOffers(){
		// show all offers (connection to database)
	}
	

}
