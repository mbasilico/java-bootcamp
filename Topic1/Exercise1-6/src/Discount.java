
public abstract class Discount {
	
	protected double total;
	
	public Discount (double total){
		
		this.total = total;
		
		total = applyDiscount(); //call the method applyDiscount() of the class instance created in ShoppingCart
		
		System.out.println("New total with discount = "+ total);
		
		Transaction transaction = new Transaction();
		transaction.addDiscount(total);
	}
	
	public abstract double applyDiscount();
	
	
}



