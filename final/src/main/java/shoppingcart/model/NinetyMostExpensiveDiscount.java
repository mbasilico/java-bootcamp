package shoppingcart.model;

import java.util.List;

public class NinetyMostExpensiveDiscount {

	public double applyDiscount(List<Item> items) {
		double max = 0;
		double amount = 0;
		for (Item i : items) {
			amount += i.getPrice();
			if (i.getPrice() > max)
				max = i.getPrice();
		}
		amount -= max;
		max *= 0.1;
		amount += max;
		return amount;
	}
}
