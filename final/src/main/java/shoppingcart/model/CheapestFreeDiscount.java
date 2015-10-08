package shoppingcart.model;

import java.util.List;

public class CheapestFreeDiscount {

	public float applyDiscount(List<Item> items) {

		float min = 999999999;
		float amount = 0;
		for (Item i : items) {
			amount += i.getPrice();
			if (i.getPrice() < min)
				min = i.getPrice();
		}
		amount -= min;
		return amount;
	}

}
