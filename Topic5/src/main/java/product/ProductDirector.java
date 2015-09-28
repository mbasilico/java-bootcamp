package product;

public class ProductDirector {

	private ProductBuilder productBuilder;

	public void setProductBuilder(ProductBuilder pb) {
		productBuilder = pb;
	}

	public Product getProduct() {
		return productBuilder.getProduct();
	}
	
	// create the product and fill it
	public void constructProduct() {
		productBuilder.createNewProduct();
		productBuilder.buildName();
		productBuilder.buildProductID();
		productBuilder.buildPrice();
		productBuilder.buildStock();
		productBuilder.buildDescription();
	}

}
