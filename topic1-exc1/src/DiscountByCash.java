import java.util.ArrayList;
import java.util.ListIterator;

public class DiscountByCash {
	public double applyDiscount(ArrayList<Items> ShopCart)	 {
		ListIterator<Items> it = ShopCart.listIterator();
		Items x = null;
	 double mostExp = 0;
	 double tot = 0;
	 while(it.hasNext())
		 {x = it.next();
		 tot = x.getPrice() + tot;
		   if (x.getPrice() > mostExp)
			   mostExp = x.getPrice();}
	 	tot = tot - (90 * mostExp / 100);
	 	return tot;
		
	} 
}
