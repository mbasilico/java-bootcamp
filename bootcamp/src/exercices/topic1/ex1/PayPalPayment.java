package exercices.topic1.ex1;

public class PayPalPayment implements PaymentStrategy {

	private String email;
	private String password;
	private DiscountStrategy discount;

	public PayPalPayment(String email, String password) {
		this.email = email;
		this.password = password;
		this.discount = new CheapestFreeDiscount();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public DiscountStrategy getDiscount() {
		return discount;
	}

	public void setDiscount(DiscountStrategy discount) {
		this.discount = discount;
	}

	public String makePayment(float amount) {
			return "Paying with PayPal";
	}
}
