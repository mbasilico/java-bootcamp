package exercices.topic1.ex1;

import java.util.ArrayList;
import java.util.Observable;

//this class is a manager to observe
//price, new offers and items change

public class ItemsManager extends Observable {

	private ArrayList<Item> items;
	
	public ItemsManager(ArrayList<Item> items) {
		if (items==null){
			items = new ArrayList<Item>();
		}else{
			this.items=items;
		}
	}

	public void addItem(Item item) {
		items.add(item);
		notifyAddedItem(item);
	}

	public void RemoveItem(int i) {
		items.remove(i);
	}

	public void notifyAddedItem(Item i) {
		this.setChanged();
		this.notifyObservers("Item " + i.getName() + "was added");
	}

	public void changePrice(Item i, float newPrice) {
		i.setPrice(newPrice);
		notifyItemPriceChange(i);
	}

	private void notifyItemPriceChange(Item i) {
		this.setChanged();
		this.notifyObservers(i.getName() + "Price changed");

	}
	
	public ArrayList<Item> getItemsByCat(String category){
		ArrayList<Item> itemsBycat = new ArrayList<Item>();
		for (Item i : items){
			if (i.getCategory().equals(category)){
				itemsBycat.add(i);
			}
		}
		return itemsBycat;
	}

	public ArrayList<Item> getItems() {
		return items;
	}

	public void clean() {
		this.items.clear();		
	}

}
