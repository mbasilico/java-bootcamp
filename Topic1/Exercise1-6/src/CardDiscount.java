
public class CardDiscount extends Discount{
	
	private int cardNumber;
	private String cardOwnerName;
	
	public CardDiscount(double total) {
		super(total); //call the constructor of the class Discount
	}
	
	public double applyDiscount(){
		total = total -(total*10/100);
		return total;
		
		
		
		
	}

}
