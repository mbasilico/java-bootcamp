package exercices.topic3.ex1;

import static org.junit.Assert.*;
import org.junit.Test;

public class NumberToStringTest {

	@Test
	public void test1toText() {
		assertEquals(NumberToString.convert(1), "one and 00/100 dollars");
	}

	@Test
	public void test2and10toText() {
		assertEquals(NumberToString.convert(2.10), "two and 10/100 dollars");
	}

	@Test
	public void test9toText() {
		assertEquals(NumberToString.convert(9), "nine and 00/100 dollars");
	}

	@Test
	public void test19toText() {
		assertEquals(NumberToString.convert(19), "nineteen and 00/100 dollars");
	}

	@Test
	public void test50and5toText() {
		assertEquals(NumberToString.convert(50.05), "fifty and 05/100 dollars");
	}

	@Test
	public void test99toText() {
		assertEquals(NumberToString.convert(99), "ninety-nine and 00/100 dollars");
	}

	@Test
	public void test200and10toText() {
		assertEquals(NumberToString.convert(200.10), "two hundred and 10/100 dollars");
	}

	@Test
	public void test999toText() {
		assertEquals(NumberToString.convert(999), "nine hundred ninety-nine and 00/100 dollars");
	}

	@Test
	public void test1000toText() {
		assertEquals(NumberToString.convert(1000), "one thousand and 00/100 dollars");
	}

	@Test
	public void test10000toText() {
		assertEquals(NumberToString.convert(10000), "ten thousand and 00/100 dollars");
	}

	@Test
	public void test9999toText() {
		assertEquals(NumberToString.convert(9999), "nine thousand nine hundred ninety-nine and 00/100 dollars");
	}

	@Test
	public void test99999toText() {
		assertEquals(NumberToString.convert(99999), "ninety-nine thousand nine hundred ninety-nine and 00/100 dollars");
	}

	@Test
	public void test900000toText() {
		assertEquals(NumberToString.convert(900000), "nine hundred thousand and 00/100 dollars");
	}

	@Test
	public void testNumber999999toText() {
		assertEquals(NumberToString.convert(999999), "nine hundred ninety-nine thousand nine hundred ninety-nine and 00/100 dollars");
	}

	@Test
	public void testNumber2523and04toText() {
		assertEquals(NumberToString.convert(2523.04), "two thousand five hundred twenty-three and 04/100 dollars");
	}

	@Test
	public void testNumber25023and04toText() {
		assertEquals(NumberToString.convert(25023.04), "twenty-five thousand twenty-three and 04/100 dollars");
	}

	@Test
	public void testNumber25023and99toText() {
		assertEquals(NumberToString.convert(25023.99), "twenty-five thousand twenty-three and 99/100 dollars");
	}

}
