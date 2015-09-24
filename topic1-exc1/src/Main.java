import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//buying Products
		ArrayList<Items> ShopCart = new ArrayList <Items>();
		
		System.out.println("-----List of products available for sale-----");
		
		ListOfItems List = new ListOfItems();
		List.cargarLista();
		
		List.printList();
		AddItemsShoppingCart SC = new AddItemsShoppingCart();
		SC.addItemsSC(ShopCart);
	   
	    //Select how to pay the items
		
			int OP; 
			WayToPay var = new WayToPay();
		    System.out.println("How would you like to pay them ?\n1-By Credit Card\n2-By Paypal\n3-Cash");
		    OP = sc.nextInt();
		    switch (OP) {
	    	case 1 : 
	    		var.byCreditCard(ShopCart);
	    		break;
	    	case 2 :
	    		var.byPaypal(ShopCart);
	    		break;
	    	case 3 : 
	    		var.byCash(ShopCart);
	    		break;}
		
		 //Print Transaction
		    System.out.println("-------Transaction-------");
		    Transaction t = new Transaction(ShopCart);
		    t.printTransaction();
		 
		    //Show The last offers
		    System.out.println("-------Offers-------");
		    Offer.cargarLista();
		    Offer.printList();
		
		
}
}
	