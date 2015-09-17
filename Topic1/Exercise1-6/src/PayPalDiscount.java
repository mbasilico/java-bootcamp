
public class PayPalDiscount extends Discount{
	
	private String paypalEmail;
	private String paypalPassword;
	
	public PayPalDiscount(double total) {
		super(total);
	}

	public double applyDiscount(){
		double discount=0;
		
		/* connect to Order table and get the last orderId inserted.
		 * make a query to get the cheapest price of product associated with that orderId .
		 * Save the value into the discount variable
		 */

		total = total-discount;
		return total;
	}

}
