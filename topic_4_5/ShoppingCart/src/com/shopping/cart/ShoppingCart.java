package com.shopping.cart;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	
	static private int transacId;
	private List<Product> items = new ArrayList<Product>();
	private List<Product> itemcart = new ArrayList<Product>();
	private List<Transaction> transac = new ArrayList<Transaction>(); 
	
	public ShoppingCart(){
		items.add(new Product(0,"null",0));
		items.add(new Product(1,"Dish",24));
		items.add(new Product(2,"Fork",60));
		items.add(new Product(3,"Cup",100));
	}
	
	public List<Product> getList(){
		System.out.println(items);
		return items;
	}
	
	public List<Product> getCart(){
		return itemcart;
	}
	
	public Product addToCart(int id) throws InterruptedException{
		itemcart.add(items.get(id));
		return items.get(id);
		
	}
	
	public String payOrder(String paytype) throws Exception{ 
		
		Transaction transaction= new Transaction();
		double total=transaction.selectedProducts(itemcart);
		
		Class cl = Class.forName("com.shopping.cart."+paytype);
		Constructor tc = cl.getConstructor(double.class,List.class);
		Object obj = tc.newInstance(total,itemcart); // create a new instance of (CreditCard/PayPal/Cash) discount class depending on the content of paytype variable.
		Method method = cl.getMethod("applyDiscount", null);
		Object obj2=method.invoke(obj,null); // call method applyDiscount of (CreditCard/PayPal/Cash) instance.
		System.out.println("Total with discount: "+obj2);
		
		double d = (double) obj2;
		++transacId;
		transac.add(transac.size(), new Transaction(transacId,transaction.getOrderId(),d));
		itemcart.clear();
		
		return "Total with discount: "+d;
	
	}
	
	
	
}
