package shoppingCart.api;

public interface ItemInterface {

	public String getName();

	public float getPrice();

	public void setPrice(float price);

	public String toString();

	public String toWordString();

	public String getCategory();

}
