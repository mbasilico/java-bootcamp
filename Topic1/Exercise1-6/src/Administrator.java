
public class Administrator extends User{
	
	//Methods available for administrators
	
	public void newOffer(){
		//add a new offer, update mail list
	}
	
	public void newProduct(){
		//add a new product, update mail list
	}
	
	public void setPrice(){
		Product product = new Product();
		product.setNewPrice(product.getProductId());
	}
	
}
