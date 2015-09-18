import java.util.ArrayList;
import java.util.ListIterator;

public class Offer {
	static ArrayList<Items> Offer = new ArrayList <Items>();
	
	 public static ArrayList<Items> CargarLista() {
			
		 Items items1 = new Items("4 Kinds T-Shirts", 600);
		 Offer.add(items1);
		
		 Items items2 = new Items("2 Bags x 1", 500);
		 Offer.add(items2);
			
		 Items items3 = new Items("3 Phone-Covers x 1", 150);
		 Offer.add(items3);
			
		 	return Offer;}

	 public static void PrintList() {
		
		 ListIterator<Items> it = Offer.listIterator();
		 Items x = null;
		 while(it.hasNext())
			 {x = it.next();
			  System.out.println(x.getName()+ "  .....  $" + x.getPrice() );}
	}
}
