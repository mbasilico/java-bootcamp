package shoppingcart.model;

import java.util.List;

public class CheapestFreeDiscount {

	public double applyDiscount(List<Item> items) {

		double min = 999999999;
		double amount = 0;
		for (Item i : items) {
			amount += i.getPrice();
			if (i.getPrice() < min)
				min = i.getPrice();
		}
		amount -= min;
		return amount;
	}

}
