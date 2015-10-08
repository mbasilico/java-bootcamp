package com.shopping.cart.main;
import java.util.List;




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
