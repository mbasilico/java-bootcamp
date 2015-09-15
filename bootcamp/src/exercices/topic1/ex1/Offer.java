package exercices.topic1.ex1;

import java.util.ArrayList;

public class Offer implements ItemInterface {

	private ArrayList<Item> items;
	private float price;
	private String name;

	public Offer(String name, float price, ArrayList<Item> items) {
		this.name = name;
		this.price = price;
		this.items = items;
	}

	public String getName() {
		return name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		System.out.println(this.getName() + "....... $" + this.getPrice());
		for (Item i : this.items) {
			System.out.println(" " + i.toString());

		}
		return null;

	}

}
