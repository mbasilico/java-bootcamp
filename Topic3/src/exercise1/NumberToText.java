package exercise1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToText {

	@Test
	public void testNumber1toText() {
		assertEquals(Numbers.toText(1), "one");
	}
	
	@Test
	public void testNumberMinus1toText() {
		assertEquals(Numbers.toText(-1), "minus one");
	}

	@Test
	public void testNumber2toText() {
		assertEquals(Numbers.toText(2), "two");
	}

	@Test
	public void testNumber5toText() {
		assertEquals(Numbers.toText(5), "five");
	}
	
	@Test
	public void testNumber19toText() {
		assertEquals(Numbers.toText(19), "nineteen");
	}
	
	@Test
	public void testNumberMinus19toText() {
		assertEquals(Numbers.toText(-19), "minus nineteen");
	}
	
	@Test
	public void testNumber20toText() {
		assertEquals(Numbers.toText(20), "twenty");
	}
	
	@Test
	public void testNumber30toText() {
		assertEquals(Numbers.toText(30), "thirty");
	}
	
	@Test
	public void testNumber35toText() {
		assertEquals(Numbers.toText(35), "thirty five");
	}
	
	@Test
	public void testNumberMinus35toText() {
		assertEquals(Numbers.toText(-35), "minus thirty five");
	}
	
	@Test
	public void testNumber99toText() {
		assertEquals(Numbers.toText(99), "ninety nine");
	}
	
	@Test
	public void testNumber100toText() {
		assertEquals(Numbers.toText(100), "one hundred");
	}
	
	@Test
	public void testNumber500toText() {
		assertEquals(Numbers.toText(500), "five hundred");
	}
	
	@Test
	public void testNumber900toText() {
		assertEquals(Numbers.toText(900), "nine hundred");
	}
	
	@Test
	public void testNumber999toText() {
		assertEquals(Numbers.toText(999), "nine hundred ninety nine");
	}
	
	@Test
	public void testNumber1000toText() {
		assertEquals(Numbers.toText(1000), "one thousand");
	}
	
	@Test
	public void testNumber10000toText() {
		assertEquals(Numbers.toText(10000), "ten thousand");
	}
	
	@Test
	public void testNumber9999toText() {
		assertEquals(Numbers.toText(9999), "nine thousand nine hundred ninety nine");
	}
	
	@Test
	public void testNumber99999toText() {
		assertEquals(Numbers.toText(99999), "ninety nine thousand nine hundred ninety nine");
	}
	
	@Test
	public void testNumber55555toText() {
		assertEquals(Numbers.toText(55555), "fifty five thousand five hundred fifty five");
	}
	
	@Test
	public void testNumber900000toText() {		
		assertEquals(Numbers.toText(900000), "nine hundred thousand");
	}
	
	@Test
	public void testNumber90000toText() {
		assertEquals(Numbers.toText(90000), "ninety thousand");
	}
	
	@Test
	public void testNumber999999toText() {
		assertEquals(Numbers.toText(999999), "nine hundred ninety nine thousand nine hundred ninety nine");
	}
	
	@Test
	public void testNumber989999toText() {
		assertEquals(Numbers.toText(989999), "nine hundred eighty nine thousand nine hundred ninety nine");
	}
	
	@Test
	public void testNumber989989toText() {
		assertEquals(Numbers.toText(989989), "nine hundred eighty nine thousand nine hundred eighty nine");
	}
	
	@Test
	public void testNumber234751toText() {		
		assertEquals(Numbers.toText(234751), "two hundred thirty four thousand seven hundred fifty one");
	}

}