
public class Client extends User{
	
	ShoppingCart cart = new ShoppingCart(); 
	
	//Methods available for clients:
	
	public void payOrder () throws Exception {
		cart.payOrder("");
	}

	public void newOrder(){
		cart.createOrder();
	}
	
	public void getList(){
		cart.getProducts();
	}
	
	public void getOffers(){
		cart.getOffers();
	}
}
