import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Administrator extends User{
	
	private int adminId;
	private ItemManager itemman;
	private Date day;

	
	public int getId (){
		return adminId;
	}
	
	public void setPrice(int ProductId, String descp, double price){
		/*
		 * insert values into Product table 
		 */
		
		itemman = new ItemManager ("New Price",adminId,day,ProductId);
	}
	
	
	public void deleteProduct(int productId){
		// delete a row of Product table
	}
	
	public void addProduct(int ProductId, String descp, double price){
		
		/*
		 * insert values into Product table 
		 */
		
		itemman = new ItemManager ("New Product",adminId,day,ProductId);
	}
	
	
}
