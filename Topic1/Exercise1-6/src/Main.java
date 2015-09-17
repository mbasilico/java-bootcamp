import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws Exception {
		
		String paytype = "CardDiscount";
		List<Product> items;
		items = new ArrayList<Product>(); 
		
		ShoppingCart cart = new ShoppingCart();
		
		cart.getList();
		
		Product product1 = new Product(1,"Glass",35); //the user select two items.
	    Product product2 = new Product(3,"Dish",10);
	    items.add(product1); 
	    items.add(product2); //save selection into array
	    
	    cart.addToCart(items);
		cart.payOrder(paytype);
	    
		
	}

}
