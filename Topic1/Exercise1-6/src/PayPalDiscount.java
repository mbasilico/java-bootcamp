import java.util.List;

public class PayPalDiscount extends Discount{
	
	private String paypalEmail;
	private String paypalPassword;
	
	public PayPalDiscount(double total,List<Product> items) throws InterruptedException {
		super(total,items);
		
	}
	
	public boolean validatePayPalUser(String paypalEmail){
		return true;}

	public double applyDiscount(){
		
		// Implementation of discount:
		double discount= Double.MAX_VALUE;
		
		for (Product product : items) {
			if (product.getPrice()<discount) 
				discount = product.getPrice();
		}
		
		total = total-discount;
		return total;
	
		
	}

}
