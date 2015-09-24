package exercices.topic1.ex1;
import exercices.topic3.ex1.NumberToString;;
public class Item implements ItemInterface {

	private int id;
	private String name;
	private String description;
	private float price;

	public Item(int id, String name, String description, float price) {
		this.id = id;
		this.setName(name);
		this.setDescription(description);
		this.setPrice(price);
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

	@Override
	public String toString() {
		return this.getName() + "....... $" + this.getPrice();
	}

	@Override
	public String toWordString() {
		return this.getName() + "....... $ " + NumberToString.convert(this.getPrice());
	}

}
