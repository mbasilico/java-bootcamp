import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ShoppingCart {
	
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Items> ShopCart = new ArrayList<Items>();
	
public static ArrayList<Items> ShopCart11() {
		
		return ShopCart;}
		
	public static void AddItemsSC()    //The products that the user want to buy will be added to the ShoppingCart(SC)
	{	
		
		ArrayList<Items> ITEMS = new ArrayList<Items>();
		
		    String item;
		    Boolean i;
		    
		    ITEMS = ListOfItems.CargarLista();
		    //ListOfItems.PrintList();
		    
		    
		    Boolean j = null;
		    
		    do{ 
		    System.out.println("Write the name of the item you would like to buy. Write 'OK' when you finish");
		    item = sc.nextLine();
		    i = item.equals("OK");
		    if (i == false)
		    	{j = false;
		    	ListIterator<Items> iter = ITEMS.listIterator();
			     Items x = null ;
			     while( j == false)
				 {
			    	 x = iter.next(); 
				 
				 	j = x.getName().equals(item);
				 	
				 	 	if (j == true)
				 	 		ShopCart.add(x);}
			     
		    	}}while (i == false);
		    	
		     System.out.println("You have selected " + ShopCart.size() + " products:");
		    	//show the complete array
		     ListIterator<Items> it = ShopCart.listIterator();
			 Items x = null;
			 double tot = 0;
			 while(it.hasNext())
				 {x = it.next();
				  System.out.println(x.getName()+ "  .....  $" + x.getPrice() );
				  tot = x.getPrice() + tot;}
				  System.out.println("Total:  .....  $" + tot);
		}
	
		    
		




	public static void main(String[] args) {
		//buying Products
		System.out.println("-----List of products available for sale-----");
		ListOfItems.CargarLista();
		ListOfItems.PrintList();
		
		AddItemsSC();
	   
	    //Select how to pay the items
		
		WayToPay.HowToPay();
		
		//Show The last offers
		System.out.println("-----Offers-----");
		Offer.CargarLista();
		Offer.PrintList();


	
	




	}




	
	}
