
import java.util.ArrayList;
import java.util.Scanner;

public class WayToPay {
	Scanner sc = new Scanner(System.in);
	
	public void byCreditCard(ArrayList<Items> ShopCart) {
	    		String name;
	    		String num;
	    		DiscountCreditCard tot1 = new DiscountCreditCard();
	    		System.out.println("You Have a discount of 10% paying by Credit Card");
	    		System.out.println("The Total now is : " + tot1.applyDiscount(ShopCart)  );
	    		System.out.print("Write your name:");
	    		name = sc.next();
	    		System.out.print("Enter your Credit Card Number:");
	    		num = sc.next();
	    		System.out.println("Name: " + name);
	    		System.out.println("Number: " + num);
	    		System.out.println("THE PURCHASE HAS BEEN MADE");}
	    		
	  public void byPaypal(ArrayList<Items> ShopCart) { 		
	    		String email;
	    		String pass;
	    		DiscountPaypal tot = new DiscountPaypal();
	    		System.out.println("Paying by Paypal you have the cheapest Item free");
	    		System.out.println("The Total now is : " + tot.applyDiscount(ShopCart) );
	    		System.out.print("Write your E-Mail:");
	    		email = sc.next();
	    		System.out.print("Password:");
	    		pass = sc.next();
	    		System.out.println("E-mail: " + email);
	    		System.out.println("Password: " + pass);
	    		System.out.println("THE PURCHASE HAS BEEN MADE");}
	    		
	   public void byCash(ArrayList<Items> ShopCart){ 		
	    		DiscountByCash tot = new DiscountByCash();
	    		System.out.println("Paying by Cash you have 90% off in the most expensive Item:");
	    		System.out.println("The Total now is : " + tot.applyDiscount(ShopCart) );
	    		System.out.println("THE PURCHASE HAS BEEN MADE");}
}



