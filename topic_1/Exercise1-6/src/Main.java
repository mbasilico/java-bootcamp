
public class Main {

	public static void main(String[] args) throws Exception {
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.getList();
		System.out.println("Items in cart: ");
		cart.addToCart(1,"Glass",35);
		cart.addToCart(3,"Dish",10);
		cart.payOrder("CashDiscount");
		
	}

}
