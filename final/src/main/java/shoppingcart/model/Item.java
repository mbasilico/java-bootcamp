package shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="ITEM")
public class Item  {

	
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private Integer id;
	
	@Column(name = "NAME", unique = true, nullable = false)
	private String name;
	
	@Column(name = "DESC")
	private String desc;
	
	@Column(name = "PRICE")
	private double price;
	
	@Column(name = "category")
	private String category;
	
	public Item(String name, String desc, double price, String category) {
		this.setName(name);
		this.setDescription(desc);
		this.setPrice(price);
		this.setCategory(category);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return desc;
	}

	public void setDescription(String description) {
		this.desc = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price2) {
		this.price = price2;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return this.getName() + "....... $" + this.getPrice();
	}


}
