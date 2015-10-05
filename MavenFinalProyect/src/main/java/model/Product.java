package model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "catalogue")
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "productID", nullable = false)
	private Long productID;

	@Column(name = "name", unique = true, nullable = false)
	@Size(max = 30)
	private String productName;

	@Column(name = "price", nullable = false, precision = 13, scale = 2)
	private BigDecimal price;

	@Column(name = "stock", nullable = false)
	private int stock;

	@Column(name = "description")
	@Size(max = 255)
	private String description;

	@Column(name = "catalogueType", nullable = false)
	private String catalogueType;	

	public Product() {
	}

	public Long getProductID() {
		return productID;
	}

	public String getName() {
		return productName;
	}

	public BigDecimal getPrice() {
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

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public void setName(String name) {
		this.productName = name;
	}

	public void setPrice(BigDecimal price) {
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
