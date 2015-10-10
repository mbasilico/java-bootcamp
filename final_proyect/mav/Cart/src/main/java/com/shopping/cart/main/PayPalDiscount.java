package com.shopping.cart.main;

import java.util.List;

public class PayPalDiscount extends Discount{
	
	public PayPalDiscount(double total,List<Product> items) throws InterruptedException {
		super(total,items);
	}
	
	public double applyDiscount(){
		
		// Implementation of discount:
		double discount= Double.MAX_VALUE;
		
		for (Product product : items) {
			if (product.getPrice()<discount) 
				discount = product.getPrice();
		}
		
		total = total-discount;
		return total;
	}
}
