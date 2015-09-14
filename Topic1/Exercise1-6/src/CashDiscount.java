
public class CashDiscount extends Discount {
	
	public CashDiscount(int orderId, double total) {
		super(orderId, total);
	}
	
	public double applyDiscount(){
		/* Cash discount implementation (connection to database)
		 * 
		 * update the new total in database
		 * 
		 */
		return total;
	
	}

}
