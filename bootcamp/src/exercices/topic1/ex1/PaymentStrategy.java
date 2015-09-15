package exercices.topic1.ex1;

public interface PaymentStrategy {

	public String makePayment(float amount);
	public DiscountStrategy getDiscount();

}
