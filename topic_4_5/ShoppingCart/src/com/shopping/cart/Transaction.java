package com.shopping.cart;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
	
	private int transacId;
	private double total;
	static private int orderId;
	private List<Order> order = new ArrayList<Order>();
	
	
	public Transaction(){}
	
	public Transaction(int transacId,int orderId,double total){
		this.transacId=transacId;
		this.orderId=orderId;
		this.total=total;
	}
	
		
	public double selectedProducts(List<Product> items) throws InterruptedException{
		++orderId;
		for (Product product : items) {
	         total = total+product.getPrice(); // calculate total from array, save into the variable total
	         order.add(order.size(),(new Order(orderId,product.getProductId())));
	    }
		
		System.out.println("Total to pay : "+ total);
		return total;
		
	}
	
	 /* The Order table contains all products associated with each order
     * [orderId	ProductId]
     * 	1			2
     * 	1			3
     * 	2			5
     * 	2			9
     */
	
	public double getTotal(){
		return total;
	}
	
	public int getId(){
		return transacId;
	}
	
	public int getOrderId(){
		return orderId;
	}
	
	
	
	
	
}