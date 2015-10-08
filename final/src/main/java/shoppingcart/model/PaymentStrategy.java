package shoppingcart.model;

import java.util.List;

public interface PaymentStrategy {

	public float makePayment(List<Item> items);
}
