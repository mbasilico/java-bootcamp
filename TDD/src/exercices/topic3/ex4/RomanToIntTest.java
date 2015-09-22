package exercices.topic3.ex4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToIntTest {

	@Test
	public void Ito1Test() {
		assertEquals(new Convert("I").toDecimalNumber(), 1);
	}

	@Test
	public void Vto5Test() {
		assertEquals(new Convert("V").toDecimalNumber(), 5);
	}

	@Test
	public void Xto10Test() {
		assertEquals(new Convert("X").toDecimalNumber(), 10);
	}

	@Test
	public void Lto50Test() {
		assertEquals(new Convert("L").toDecimalNumber(), 50);
	}

	@Test
	public void Cto100Test() {
		assertEquals(new Convert("C").toDecimalNumber(), 100);
	}

	@Test
	public void Dto500Test() {
		assertEquals(new Convert("D").toDecimalNumber(), 500);
	}

	@Test
	public void Mto1000Test() {
		assertEquals(new Convert("M").toDecimalNumber(), 1000);
	}

}
