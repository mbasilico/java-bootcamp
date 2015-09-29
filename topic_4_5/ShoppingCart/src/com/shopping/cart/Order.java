package com.shopping.cart;

public class Order {
	private int orderId;
	private int productId;
	
	public Order(int orderId, int productId){
		this.orderId=orderId;
		this.productId=productId;
	}
	
	public int getOrderId(){
		return orderId;
	}

	public int getProductId(){
		return productId;
	}
}
