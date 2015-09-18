
import java.util.ArrayList;
import java.util.Scanner;

public class WayToPay {

	
	
	
	
	public static void HowToPay() {
		Scanner sc = new Scanner(System.in);
	int OP ;
	    System.out.println("How would you like to pay them ?\n1-By Credit Card\n2-By Paypal\n3-Cash");
	    OP = sc.nextInt();
	    switch (OP) {
	    	case 1 :
	    		String name;
	    		String num;
	    		CashDiscount tot = new CashDiscount();
	    		System.out.println("You Have a discount of 10% paying by Credit Card");
	    		System.out.println("The Total now is : " + tot.DiscountCreditCard()  );
	    		System.out.print("Write your name:");
	    		name = sc.next();
	    		System.out.print("Enter your Credit Card Number:");
	    		num = sc.next();
	    		System.out.println("Name: " + name);
	    		System.out.println("Number: " + num);
	    		System.out.println("The purchase has been made");
	    		break;
	    	case 2 : 
	    		String email;
	    		String pass;
	    		CashDiscount tot1 = new CashDiscount();
	    		System.out.println("Paying by Paypal you have the cheapest Item free");
	    		System.out.println("The Total now is : " + tot1.DiscountPaypal() );
	    		System.out.print("Write your E-Mail:");
	    		email = sc.next();
	    		
	    		System.out.print("Password:");
	    		pass = sc.next();
	    		System.out.println("E-mail: " + email);
	    		System.out.println("Password: " + pass);
	    		System.out.println("The purchase has been made");
	    		break;
	    	case 3 :
	    		CashDiscount tot2 = new CashDiscount();
	    		System.out.println("Paying by Cash you have 90% off in the most expensive Item:");
	    		System.out.println("The Total now is : " + tot2.DiscountByCash() );
	    		System.out.println("The purchase has been made");
}
}

	
 
		
			
		
			
			}

