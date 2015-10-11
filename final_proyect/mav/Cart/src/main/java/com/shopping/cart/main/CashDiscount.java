package com.shopping.cart.main;

import java.util.List;

public class CashDiscount extends Discount{

	public CashDiscount(double total,List<Product> items) throws InterruptedException {
		super(total,items);
	}
	
	public double applyDiscount(){
		double discount=0;
		
		// Implementation of discount:
		for (Product product : items) {
			if (product.getPrice()>discount) 
				discount = product.getPrice();
		}
		
		discount = (discount*90/100);
		total = total-discount;
		return total;
	
	}

}
