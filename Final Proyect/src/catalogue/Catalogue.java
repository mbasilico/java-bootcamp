package catalogue;

import java.util.ArrayList;
import java.util.List;

import product.Product;

public class Catalogue {

	List<Product> catalogue = new ArrayList<Product>();
	String type;

	public List<Product> getCatalogue() {
		return catalogue;
	}

	public Product getProduct(String id) {
		for (Product product : catalogue) {
			if (product.getProductID() == id) {
				return product;
			}
		}
		return null;
	}

	public String getType() {
		return type;
	}

	public void setCatalogue(List<Product> catalogue) {
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

	public void addProduct(Product product) {
		this.catalogue.add(product);
	}

	public void removeProductFromCatalogue(Product product) {
		this.catalogue.remove(catalogue.indexOf(product));
	}

}
