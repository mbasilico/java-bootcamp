import java.util.List;

public class CashDiscount extends Discount {
	
	public CashDiscount(double total,List<Product> items) {
		super(total,items);
	}
	
	private int orderId;
	
	public double applyDiscount(){
		double discount=0;
		
		// Implementation without using sql queries:
		for (Product product : items) {
			if (product.getPrice()>discount) 
				discount = product.getPrice();
		}
		
		discount = (discount*90/100);
		total = total-discount;
		return total;
	
	}

}
