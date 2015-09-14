
public class PayPalDiscount extends Discount{
	
	private String paypalEmail;
	private String paypalPassword;
	
	public PayPalDiscount(int orderId, double total) {
		super(orderId, total);
	}

	public double applyDiscount(){
		/* PayPal discount implementation (connection to database)
		 * 
		 * update the new total in the database.
		 *
		 */
		return total-30; // for demostration purposes, we assume the PayPal discount is 30
		
	}

}
