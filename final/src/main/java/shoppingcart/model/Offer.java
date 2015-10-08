package shoppingcart.model;

import java.util.ArrayList;

//import exercices.topic3.ex1.NumberToString;

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
		String s=this.getName() + "....... $" + this.getPrice()+"\n";
		for (Item i : this.items) {
			s+=" " + i.toString()+"\n";

		}
		return s;

	}

//	@Override
//	public String toWordString() {
//		System.out.println(this.getName() + "....... $" + NumberToString.convert(this.getPrice()));
//		for (Item i : this.items) {
//			System.out.println(" " + i.toString());
//
//		}
//		return null;
//	}

	public String getCategory() {
		return "Offers dont have categories";
		
	}

}
