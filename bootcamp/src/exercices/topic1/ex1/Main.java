package exercices.topic1.ex1;

public class Main {


	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart();
		Item i = new Item(1, "item 1", "a description", 10);
		cart.addItem(i);
		Item i2 = new Item(2, "item 2", "another description", 20);
		cart.addItem(i2);
		float amount = new CashPayment().makePayment(cart.getItems());// -90% of most expensive (20)+10 = 12 
		Transaction t = new Transaction(amount, cart.getItems());
		System.out.println(t.showTransaction());
		Item i3 = new Item(45, "item 45", "another description", 100);
		cart.addItem(i3);
		float amount2 = new PayPalPayment("mail@gmail.com","*********").makePayment(cart.getItems());//cheaper(10) free 100+20
		Transaction t2 = new Transaction(amount2, cart.getItems());
		System.out.println(t2.showTransaction());
		float amount3 = new CreditCardPayment("name", 432542543).makePayment(cart.getItems());//10% 117
		Transaction t3 = new Transaction(amount3, cart.getItems());
		System.out.println(t3.showTransaction());
	}

}
