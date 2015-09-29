package com.shopping.cart;
import java.util.List;

public abstract class Discount {
	
	protected double total;
	protected List<Product> items;
	
	public Discount (double total, List<Product> items) throws InterruptedException{
		
		this.total = total;
		this.items = items;
	}
	
	public abstract double applyDiscount();
	
	
}



