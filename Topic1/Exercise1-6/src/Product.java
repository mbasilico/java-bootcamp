
public class Product {
	
	private int productId;
	private String descp;
	private double price;
	
	public Product(int productId,String descp,double price){
		this.productId=productId;
		this.descp=descp;
		this.price=price;
	}
	
	public int getProductId(){
	
		return productId;
	}
	
	public String getDescp(){
		return descp;
	}
	
	public double getPrice(){
		return price;
	}
	
	
}
