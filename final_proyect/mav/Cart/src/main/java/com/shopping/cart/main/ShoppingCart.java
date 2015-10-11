package com.shopping.cart.main;
import java.lang.reflect.*;
import java.util.List;


public class ShoppingCart {
	
	public ShoppingCart(){}
	
	public double payOrder(String paytype, List<Product> itemcart) throws Exception{ 
		
		double total = 0;
		for (Product product : itemcart) 
			total = total+product.getPrice();
		
		Class cl = Class.forName("com.shopping.cart.main."+paytype);
		Constructor tc = cl.getConstructor(double.class,List.class);
		Object obj = tc.newInstance(total,itemcart); // create a new instance of (CreditCard/PayPal/Cash) discount class depending on the content of paytype variable.
		Method method = cl.getMethod("applyDiscount", null);
		Object obj2=method.invoke(obj,null); // call method applyDiscount of (CreditCard/PayPal/Cash) instance.
		
		Double d = (Double) obj2;
		return d;
		
	}
	
	
	
}
