package exercices.topic1.ex1;

public class CheapestFreeDiscount implements DiscountStrategy {

	@Override
	public float applyDiscount() {

		//"Cheapest item is free";
		return 0;
	}

}
