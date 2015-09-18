import java.util.ListIterator;

public class CashDiscount {
	
	public double DiscountCreditCard() {
		 
		ListIterator<Items> it = ShoppingCart.ShopCart.listIterator();
		Items x = null;
	 double tot = 0 ;
	 while(it.hasNext())
		 {x = it.next();
		  tot = x.getPrice() + tot;}
		  tot = tot - (10 * tot / 100);
		 return tot;}
		  
	public double DiscountPaypal() {
		 
		ListIterator<Items> it = ShoppingCart.ShopCart.listIterator();
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
	
	public double DiscountByCash()	 {
		ListIterator<Items> it = ShoppingCart.ShopCart.listIterator();
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
