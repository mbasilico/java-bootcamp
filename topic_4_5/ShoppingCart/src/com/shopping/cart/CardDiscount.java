package com.shopping.cart;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

@JsonAutoDetect
public class CardDiscount extends Discount{
	
	private long cardNumber;
	private String cardOwnerName;
	
	public CardDiscount(double total,List<Product> items) throws InterruptedException {
		super(total,items); //call the constructor of the class Discount
	}
	
	public boolean validateCard(long number){
		return true;
	}
	
	public double applyDiscount(){
		// Implementation of discount:
		total = total -(total*10/100);
		return total;
		
	}

}
