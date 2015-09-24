import java.util.ArrayList;
import java.util.ListIterator;

public class DiscountCreditCard {

	public double applyDiscount(ArrayList<Items> ShopCart) {
		 
		ListIterator<Items> it = ShopCart.listIterator();
		Items x = null;
	 double tot = 0 ;
	 while(it.hasNext())
		 {x = it.next();
		  tot = x.getPrice() + tot;}
		  tot = tot - (10 * tot / 100);
		 return tot;}

	
	}

