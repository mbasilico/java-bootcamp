import java.util.List;

public class CardDiscount extends Discount{
	
	private long cardNumber;
	private String cardOwnerName;
	
	public CardDiscount(double total,List<Product> items) throws InterruptedException {
		super(total,items); //call the constructor of the class Discount
	}
	
<<<<<<< HEAD
	public boolean validateCard(long number){
		return true;
	}
=======
	public boolean validateCard(int cardNumber){
		return true;
>>>>>>> 0857e727d5fb13721511bb33a7447f32d77210de
	
	public double applyDiscount(){
		// Implementation of discount:
		total = total -(total*10/100);
		return total;
		
		
		
		
	}

}
