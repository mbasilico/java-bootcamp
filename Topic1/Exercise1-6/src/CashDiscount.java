
public class CashDiscount extends Discount {
	
	public CashDiscount(double total) {
		super(total);
	}
	
	private int orderId;
	
	public double applyDiscount(){
		double discount=0;
		
		/* connect to Order table and get the last orderId inserted.
		 * make a query to get the highest price of product associated with that orderId .
		 * Save the value into the discount variable
		 */
		discount = discount -(discount*90/100);
		total = total-discount;
	return total;
	
	}

}
