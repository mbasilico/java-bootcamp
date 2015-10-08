//package shoppingCart.test;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import shoppingcart.DAO.ShoppingCart;
//import shoppingcart.model.CashPayment;
//import shoppingcart.model.CreditCardPayment;
//import shoppingcart.model.Item;
//import shoppingcart.model.Offer;
//import shoppingcart.model.PayPalPayment;
//import shoppingcart.model.Transaction;
//
//
//public class ShoppingCartTest {
//
//	@Test
//	public void test() {
//		ShoppingCart cart = new ShoppingCart("Cart 1");
//		Item i = new Item(1, "item 1", "a description", 10 , "cat 2");
//		cart.addItem(i);
//		Item i2 = new Item(2, "item 2", "another description", 20 , "cat 2");
//		cart.addItem(i2);
//		float amount = cart.pay(new CashPayment());// -90% of most expensive (20)+10 = 12 
//		assertEquals(amount,12,0);
//		Transaction t = new Transaction(amount, cart.getItems());
//		System.out.println(cart.getName());
//		assertEquals(cart.getName(),"Cart 1");
//		System.out.println(t.showTransaction());
//		assertEquals(t.showTransaction(),"Transaction N 1 made in: "+t.getDate()+" for:$ 12.0 items: [item 1....... $10.0, item 2....... $20.0]");
//		Item i3 = new Item(45, "item 45", "another description", 100 , "cat 1");
//		cart.addItem(i3);
//		float amount2 = cart.pay(new PayPalPayment("mail@gmail.com","*********"));//cheaper(10) free 100+20
//		assertEquals(amount2,120,0);
//		Transaction t2 = new Transaction(amount2, cart.getItems());
//		System.out.println(t2.showTransaction());
//		assertEquals(t2.showTransaction(),"Transaction N 2 made in: "+t.getDate()+" for:$ 120.0 items: [item 1....... $10.0, item 2....... $20.0, item 45....... $100.0]");
//		float amount3 = cart.pay(new CreditCardPayment("name", 432542543));//10% 117
//		assertEquals(amount3,117,0);
//		Transaction t3 = new Transaction(amount3, cart.getItems());
//		System.out.println(t3.showTransaction());
//		assertEquals(t3.showTransaction(),"Transaction N 3 made in: "+t.getDate()+" for:$ 117.0 items: [item 1....... $10.0, item 2....... $20.0, item 45....... $100.0]");
//		Offer o = new Offer("Offer1", 100, cart.getItems());
//		String s = o.toString();
//		assertEquals(s,"Offer1....... $100.0\n item 1....... $10.0\n item 2....... $20.0\n item 45....... $100.0\n");
//	}
//
//}
