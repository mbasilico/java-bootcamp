package exercices.topic1.ex1;

public class CreditCardPayment implements PaymentStrategy {

	private String name;
	private int creditCardNumber;
	private DiscountStrategy discount;

	public CreditCardPayment(String name, int creditCardNumber) {
		this.name = name;
		this.creditCardNumber = creditCardNumber;
		this.discount = new TenPercentDiscount();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public DiscountStrategy getDiscount() {
		return discount;
	}

	public void setDiscount(DiscountStrategy discount) {
		this.discount = discount;
	}

	public String makePayment(float amount) {
			return "Paying with Credit Card";
	}

}
