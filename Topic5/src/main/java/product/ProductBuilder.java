package product;

public abstract class ProductBuilder {

	protected Product product;

	public Product getProduct() {
		return product;
	}

	public void createNewProduct() {
		product = new Product();
	}

	public abstract void buildName();

	public abstract void buildProductID();

	public abstract void buildPrice();

	public abstract void buildStock();

	public abstract void buildDescription();

}
