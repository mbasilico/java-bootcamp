
public abstract class Discount {
	
	static int counter; // counter of transactions
	protected int orderId;
	protected double total;
	
	public Discount (int orderId, double total){
		this.orderId = orderId;
		this.total = total;
		
		counter = counter +1;
		
		total = applyDiscount(); //call the method applyDiscount() of the class instance created in ShoppingCart
		
		System.out.println("Transaction counter = " + counter);
		System.out.println("New total with discount = "+ total);
		
		//update mail list
	}
	
	
	public abstract double applyDiscount();
	
	
}



