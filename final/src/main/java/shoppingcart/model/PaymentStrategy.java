package shoppingcart.model;

import java.util.List;

public interface PaymentStrategy {

	public double makePayment(List<Item> items);
}
