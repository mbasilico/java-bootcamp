package exercices.topic1.ex1;

import java.util.List;

public interface PaymentStrategy {

	public float makePayment(List<Item> items);
}
