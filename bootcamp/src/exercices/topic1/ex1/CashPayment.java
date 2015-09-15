package exercices.topic1.ex1;

public class CashPayment implements PaymentStrategy {

	private DiscountStrategy discount;

	public CashPayment() {
		this.discount = new NinetyMostExpensiveDiscount();
	}

	public DiscountStrategy getDiscount() {
		return discount;
	}

	public void setDiscount(DiscountStrategy discount) {
		this.discount = discount;
	}

	public String makePayment(float amount) {
			return "Paying with cash";
	}

}
