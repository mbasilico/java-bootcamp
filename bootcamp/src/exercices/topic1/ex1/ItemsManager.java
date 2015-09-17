package exercices.topic1.ex1;

import java.util.ArrayList;
import java.util.Observable;

//this class is a manager to observe
//price, new offers and items change

public class ItemsManager extends Observable {

	private ArrayList<ItemInterface> items;

	public ItemsManager(ArrayList<ItemInterface> items) {
		items = new ArrayList<ItemInterface>();
	}

	public void addItem(Item item) {
		items.add(item);
		notifyAddedItem(item);
	}

	public void RemoveItem(Item item) {
		items.remove(item);
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

}
