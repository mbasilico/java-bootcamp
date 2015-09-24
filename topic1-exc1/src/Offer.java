import java.util.ArrayList;
import java.util.ListIterator;

public class Offer {
	static ArrayList<Items> Offer = new ArrayList <Items>();
	
	 public static ArrayList<Items> cargarLista() {
			
		 Items items1 = new Items("4 Kinds T-Shirts", 600, 100);
		 Offer.add(items1);
		
		 Items items2 = new Items("2 Bags x 1", 500 , 200);
		 Offer.add(items2);
			
		 Items items3 = new Items("3 Phone-Covers x 1", 150 , 300);
		 Offer.add(items3);
			
		 	return Offer;}

	 public static void printList() {
		
		 ListIterator<Items> it = Offer.listIterator();
		 Items x = null;
		 while(it.hasNext())
			 {x = it.next();
			  System.out.println(x.getName()+ "  .....  $" + x.getPrice() );}
	}
}
