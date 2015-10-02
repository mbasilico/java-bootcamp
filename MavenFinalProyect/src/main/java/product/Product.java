package product;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "catalogue")
public class Product {

	@GeneratedValue
	@Id
	@Column(name = "productID", nullable = false)
	String productID;

	@Column(name = "name", unique = true, nullable = false)
	String name;

	@Column(name = "price", nullable = false)
	double price;

	@Column(name = "stock", nullable = false)
	int stock;

	@Column(name = "description")
	String description;

	@Column(name = "catalogueType", nullable = false)
	String catalogueType;

	public String getProductID() {
		return productID;
	}

	public String getName() {
		return name;
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

	public String getCatalogueType() {
		return catalogueType;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setName(String name) {
		this.name = name;
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

	public void setCatalogueType(String catalogueType) {
		this.catalogueType = catalogueType;
	}

}
