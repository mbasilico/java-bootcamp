import java.util.ArrayList;

public class ShoppingCart {



	private ArrayList<Items> items;

	public ShoppingCart() {
		items = new ArrayList<Items>();
	}

	public ArrayList<Items> getItems() {
		return items;
	}

	public void setItems(ArrayList<Items> items) {
		this.items = items;
	}

	public void deleteItem(Items i) {
		items.remove(i);
	}

	public void addItem(Items i) {
		items.add(i);
	}
	
		
	}




