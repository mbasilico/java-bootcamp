package exercices.topic1.ex1;

import java.util.List;

public class NinetyMostExpensiveDiscount {

	public float applyDiscount(List<Item> items) {
		float max = 0;
		float amount = 0;
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
