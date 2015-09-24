import java.util.ArrayList;
import java.util.ListIterator;

public class DiscountPaypal {
	public double applyDiscount(ArrayList<Items> ShopCart) {
		 
		ListIterator<Items> it = ShopCart.listIterator();
		Items x = null;
	 double cheapest = 9999999;
	 double tot = 0;
	 while(it.hasNext())
		 {x = it.next();
		 tot = x.getPrice() + tot;
		   if (x.getPrice() < cheapest)
			   cheapest = x.getPrice();}
	 	tot = tot - cheapest;
	 	return tot;
		  
		
		 }

	}
