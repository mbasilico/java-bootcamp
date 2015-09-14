
public class Order{
	
	private int orderId;
	private double total;
	
	
	public void addToCart(){
		//add product to user's cart
	}
	
	public void placeNewOrder(){
		//update database with new order
	}
	
	public int getOrder(){ 
		//connect to database and get the order ID
		return orderId;
	}
	
	public double getTotal(){
		//connect to database and get the total of the order
		return(total);
	}
	

}