package shoppingCart.api;

import java.util.List;

public class TenPercentDiscount {

	public float applyDiscount(List<Item> items) {
		float amount = 0;
		for (Item i : items) {
			amount += i.getPrice();
		}
		amount *= 0.9;
		return amount;
	}
}
