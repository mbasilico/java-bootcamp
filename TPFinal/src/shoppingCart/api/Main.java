package shoppingCart.api;

public class Main {


	public static void main(String[] args) {
		
		ShoppingCart cart = new ShoppingCart("Cart 1");
		Item i = new Item(1, "item 1", "a description", 10 , "cat 2");
		cart.addItem(i);
		Item i2 = new Item(2, "item 2", "another description", 20 , "cat 2");
		cart.addItem(i2);
		float amount = cart.pay(new CashPayment());// -90% of most expensive (20)+10 = 12 
		Transaction t = new Transaction(amount, cart.getItems());
		System.out.println(cart.getName());
		System.out.println(t.showTransaction());
		Item i3 = new Item(45, "item 45", "another description", 100 , "cat 1");
		cart.addItem(i3);
		float amount2 = cart.pay(new PayPalPayment("mail@gmail.com","*********"));//cheaper(10) free 100+20
		Transaction t2 = new Transaction(amount2, cart.getItems());
		System.out.println(t2.showTransaction());
		float amount3 = cart.pay(new CreditCardPayment("name", 432542543));//10% 117
		Transaction t3 = new Transaction(amount3, cart.getItems());
		System.out.println(t3.showTransaction());
		Offer o = new Offer("Offer1", 100, cart.getItems());
		o.toString();
	
	}

}
