import java.util.ArrayList;

import java.util.ListIterator;

public class ListOfItems  {
	 
	static ArrayList<Items> List = new ArrayList <Items>();
	
	 public static ArrayList<Items> CargarLista() {
			
		 Items items1 = new Items("Glasses", 150);
		 	List.add(items1);
		
		 Items items2 = new Items("T-Shirt", 320);
		 	List.add(items2);
			
		 Items items3 = new Items("Shoes", 500);
		 	List.add(items3);
		 	
		 Items items4 = new Items("Cell Phone", 5400);
		 	List.add(items4);
		 	
		 Items items5 = new Items("Jacket", 1500);
		 	List.add(items5);
		 	
		 Items items6 = new Items("Shirt", 930);
		 	List.add(items6);
		 	
		 Items items7 = new Items("Ps3", 3200);
		 	List.add(items7);
		 	
		 Items items8 = new Items("LCD-Samsung", 9650);
		 	List.add(items8);
		 	
		 Items items9 = new Items("Jean", 900);
		 	List.add(items9);
			
		 	return List;}

	 public static void PrintList() {
		
		 ListIterator<Items> it = List.listIterator();
		 Items x = null;
		 while(it.hasNext())
			 {x = it.next();
			  System.out.println(x.getName()+ "  .....  $" + x.getPrice() );}
	}
	
		
}

