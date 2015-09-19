import java.util.List;

public abstract class Discount {
	
	protected double total;
	protected List<Product> items;
	
	public Discount (double total, List<Product> items) throws InterruptedException{
		
		this.total = total;
		this.items = items;
		
		total = applyDiscount(); //call the method applyDiscount() of the class instance created in ShoppingCart
		
		System.out.println("New total with discount = "+ total);
		
		Transaction transaction = new Transaction();
		transaction.addDiscount(total);
	}
	
	public abstract double applyDiscount();
	
	
}



