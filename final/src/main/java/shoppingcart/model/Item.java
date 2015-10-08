package shoppingcart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//import exercices.topic3.ex1.NumberToString;

@Entity
@Table(name="item")
public class Item implements ItemInterface {

	
	@Id
	@GeneratedValue
	@Column(name = "itemID", nullable = false)
	private Integer itemID;
	
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "price", nullable = false)
	private float price;
	
	@Column(name = "category")
	private String category;
	
	public Item(Integer id, String name, String description, float price, String category) {
		this.itemID = id;
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
		this.setCategory(category);
	}

	public int getId() {
		return itemID;
	}

	public void setId(int id) {
		this.itemID = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
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

//	@Override
//	public String toWordString() {
//		return this.getName() + "....... $ " + NumberToString.convert(this.getPrice());
//	}

}
