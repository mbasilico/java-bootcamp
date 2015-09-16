
public class CashDiscount extends Discount {
	
	public CashDiscount(int orderId, double total) {
		super(orderId, total);
	}
	
	public double applyDiscount(){
		/* Cash discount implementation:
		 * 
		 * update the new total
		 * 
		 */
		return total;
	
	}

}
