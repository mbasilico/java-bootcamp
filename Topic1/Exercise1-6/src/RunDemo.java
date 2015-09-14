
public class RunDemo {

	public static void main(String[] args) throws Exception {
		String paytype = "CardDiscount";
		
		ShoppingCart cart = new ShoppingCart();
		cart.payOrder(paytype); 
		cart.payOrder("PayPalDiscount");
		
	}

}
