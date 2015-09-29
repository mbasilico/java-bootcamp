package com.shopping.cart;

public class Main {

	public static void main(String[] args) throws Exception {
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.addToCart(1);
		cart.addToCart(3);
		cart.payOrder("CardDiscount");
	}
		
}
