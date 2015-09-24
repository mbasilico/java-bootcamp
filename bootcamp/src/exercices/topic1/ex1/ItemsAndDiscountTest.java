package exercices.topic1.ex1;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ItemsAndDiscountTest {

	private ArrayList<Item> listaTest;

	private ArrayList<Item> initializeList() {
		Item i1 = new Item(1, null, null, 10);
		Item i2 = new Item(2, null, null, 10);
		Item i3 = new Item(3, null, null, 20);
		this.listaTest = new ArrayList<Item>();
		this.listaTest.add(i1);
		this.listaTest.add(i2);
		this.listaTest.add(i3);
		return listaTest;

	}

	@Test
	public void addItemsTest() {
		initializeList();
		assertEquals(this.listaTest.size(), 3);
		this.listaTest.remove(1);
		assertEquals(this.listaTest.size(), 2);
		Item i4 = new Item(4, null, null, 20);
		this.listaTest.add(i4);
		assertEquals(this.listaTest.size(), 3);
		this.listaTest.get(2).toWordString();
		assertEquals(this.listaTest.get(2).toWordString(), "null....... $ twenty and 00/100 dollars");
		this.listaTest.clear();
		assertEquals(listaTest.size(), 0);
	}

	@Test
	public void tenPercentTest() {
		initializeList();
		float discount = new TenPercentDiscount().applyDiscount(this.listaTest);
		assertEquals(36, discount, 0);//total is 40 - 10% = 36
	}

	@Test
	public void cheapestFreeTest() {
		initializeList();
		Item i4 = new Item(4, null, null, 5);
		this.listaTest.add(i4);
		float discount = new CheapestFreeDiscount().applyDiscount(listaTest);
		assertEquals(40, discount, 0);//item added is cheapest so its free, total 45 - 5 = 40
	}

	@Test
	public void nintyMExpensiveTest() {
		initializeList();
		float discount = new NinetyMostExpensiveDiscount().applyDiscount(listaTest);
		assertEquals(22, discount, 0);//most expensive is 20 so 10+10+2(20-90%)=22
	}

}
