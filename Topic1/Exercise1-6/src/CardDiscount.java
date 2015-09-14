
public class CardDiscount extends Discount{
	
	private int cardNumber;
	private String cardOwnerName;
	
	public CardDiscount(int orderId, double total) {
		super(orderId, total); //call the constructor of the class Discount
	}
	
	public double applyDiscount(){
		//CreditCard discount implementation:
		
		total = total -(total*10/100);
		return total;
		/*
		 * update the new total in the database
		 */
		
	}

}
