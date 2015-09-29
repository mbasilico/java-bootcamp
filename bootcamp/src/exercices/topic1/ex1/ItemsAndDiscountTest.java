package exercices.topic1.ex1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

public class ItemsAndDiscountTest {

	private ArrayList<Item> listaTest;
	private ItemsManager iManager;
	
	private ItemsManager initializeList() {
		
		Item i1 = new Item(1, "item1", "this is item1", 10 , "cat 1");
		Item i2 = new Item(2, "item2", "this is item2", 10 , "cat 2");
		Item i3 = new Item(3, "item3", "this is item3", 20 , "cat 1");
		this.listaTest = new ArrayList<Item>();
		this.listaTest.add(i1);
		this.listaTest.add(i2);
		this.listaTest.add(i3);
		iManager = new ItemsManager(listaTest);
		return iManager;
	}

	@Test
	public void addItemsTest() {
		initializeList();
		assertEquals(this.iManager.getItems().size(), 3);
		this.iManager.RemoveItem(1);
		assertEquals(this.iManager.getItems().size(), 2);
		Item i4 = new Item(4, "item 4", "this is item 4", 20 , "cat 3");
		this.iManager.addItem(i4);
		assertEquals(this.iManager.getItems().size(), 3);
		this.iManager.getItems().get(2).toWordString();
		assertEquals(this.iManager.getItems().get(2).toWordString(), "item 4....... $ twenty and 00/100 dollars");
		this.iManager.clean();
		assertEquals(this.iManager.getItems().size(), 0);
	}

	@Test
	public void getItemsByCategory(){
		initializeList();
		assertEquals(this.iManager.getItems().size(),3);
		Item i1 = new Item(1, "item1", "this is item1", 10 , "cat 1");
		Item i3 = new Item(3, "item3", "this is item3", 20 , "cat 1");
		ArrayList<Item>lista1 = new ArrayList<Item>();
		ItemsManager iManager2 = new ItemsManager(lista1);
		iManager2.addItem(i1);
		iManager2.addItem(i3);
		assertEquals(iManager2.getItems(), this.iManager.getItemsByCat("cat 1"));
		//assert result:java.lang.AssertionError: expected: java.util.ArrayList<[item1....... $10.0, item3....... $20.0]> but was: java.util.ArrayList<[item1....... $10.0, item3....... $20.0]>
		
	}
	
	@Test
	public void tenPercentTest() {
		initializeList();
		float discount = new TenPercentDiscount().applyDiscount(iManager.getItems());
		assertEquals(36, discount, 0);//total is 40 - 10% = 36
	}

	@Test
	public void cheapestFreeTest() {
		initializeList();
		Item i4 = new Item(4, "item 4", "this is item 4", 5 , "cat 3");
		this.iManager.addItem(i4);
		float discount = new CheapestFreeDiscount().applyDiscount(iManager.getItems());
		assertEquals(40, discount, 0);//item added is cheapest so its free, total 45 - 5 = 40
	}

	@Test
	public void nintyMExpensiveTest() {
		initializeList();
		float discount = new NinetyMostExpensiveDiscount().applyDiscount(iManager.getItems());
		assertEquals(22, discount, 0);//most expensive is 20 so 10+10+2(20-90%)=22
	}

}
