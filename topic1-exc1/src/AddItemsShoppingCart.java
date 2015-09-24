import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class AddItemsShoppingCart {
	
	Scanner sc = new Scanner(System.in);

	public void addItemsSC(ArrayList<Items> ShopCart)    //The products that the user want to buy will be added to the ShoppingCart(SC)
	{	
		    int product;
		    Boolean i;
		    
		    ListOfItems ITEMS = new ListOfItems();
		    
		    Boolean j = null;
		    
		    do{ 
		    System.out.println("Write the ID of the item you would like to buy. Write '0' (cero) when you finish");
		    product = sc.nextInt();
		    i = (product == 0);
		    if (i == false)
		    	{j = false;
				ListIterator <Items> iter = ITEMS.cargarLista().listIterator();
			     Items x = null ;
			     while( j == false)
				 {
			    	 x = iter.next(); 
				 
				 	j = (x.getID() == product);
				 	
				 	 	if (j == true)
				 	 		ShopCart.add(x);}
			     
		    	}}while (i == false);
		    	
		     System.out.println("You have selected " + ShopCart.size() + " products:");
		    	
		    
		     //ShowItems
		     ListIterator<Items> it = ShopCart.listIterator();
			 Items x = null;
			 double tot = 0;
			 while(it.hasNext())
				 {x = it.next();
				  System.out.println(x.getName()+ "  .....  $" + x.getPrice() );
				  tot = x.getPrice() + tot;}		
			 	  System.out.println("Total" + "........ $" +  tot);}
				
				  
		
}
