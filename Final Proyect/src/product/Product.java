package product;

public class Product {

	String name;
	String productID;
	double price;
	int stock;
	String description;
	String catalogueType;

	@Override
	public String toString() {
		return "Product [Name= " + name + ", ProductID= " + productID + ", Price= " + price + ", Stock= " + stock + ", Description= "
				+ description + ", Catalogue Type: " + catalogueType + "]";
	}

	public String getName() {
		return name;
	}

	public String getProductID() {
		return productID;
	}

	public double getPrice() {
		return price;
	}

	public int getStock() {
		return stock;
	}

	public String getDescription() {
		return description;
	}
	
	public String getCatalogueType(){
		return catalogueType;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setCatalogueType(String catalogueType){
		this.catalogueType= catalogueType;
	}

}
