package catalogue;

import java.util.ArrayList;

import product.Product;

public class Catalogue {

	ArrayList<Product> catalogue;
	String type;

	public ArrayList<Product> getCatalogue() {
		return catalogue;
	}

	public String getType() {
		return type;
	}

	public void setCatalogue(ArrayList<Product> catalogue) {
		this.catalogue = catalogue;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		if (catalogue.isEmpty()) {
			return "there are no elements.";
		} else {
			return "Catalogue [catalogue= " + catalogue + ", type= " + type + "]";
		}
	}

	public String showProducts() {
		String show = "Content of catalogue: \n";
		if (catalogue.isEmpty()) {
			show += "there are no elements.";
		} else {
			for (Product product : catalogue) {
				show += "Item Name: " + product.getName() + " .....$ price: " + product.getPrice() + "\n";
			}
		}
		return show;
	}
	
	public void addProduct(Product product){
		this.catalogue.add(product);
	}
	
	public void deleteProductFromCart(Product product) {
		this.catalogue.remove(catalogue.indexOf(product));		
	}

}
