import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToWordTest {

	@Test
	public void Convert1Test() {
		assertEquals(Numbers.convertNumber(1), "One");
	}

	@Test
	public void Convert2Test() {
		assertEquals(Numbers.convertNumber(2), "Two");
	}

	@Test
	public void Convert5Test() {
		assertEquals(Numbers.convertNumber(5), "Five");
	}

	@Test
	public void Convert16Test() {
		assertEquals(Numbers.convertNumber(16), "Sixteen");
	}

	@Test
	public void Convert20Test() {
		assertEquals(Numbers.convertNumber(20), "Twenty");
	}
	
	@Test
	public void Convert55Test() {
		assertEquals(Numbers.convertNumber(55), "Fifty - Five");
	}

	@Test
	public void Convert100Test() {
		assertEquals(Numbers.convertNumber(100), "One Hundred");
	}

	@Test
	public void Convert1000Test() {
		assertEquals(Numbers.convertNumber(1000), "One Thousand ");
	}
	
	@Test
	public void Convert1500Test() {
		assertEquals(Numbers.convertNumber(1500), "One Thousand  Five Hundred");
	}
	
	@Test
	public void Convert1535Test() {
		assertEquals(Numbers.convertNumber(1535), "One Thousand  Five Hundred and Thirty - Five");
	}

	@Test
	public void Convert10000Test() {
		assertEquals(Numbers.convertNumber(10000), "Ten Thousand ");
	}
	
	@Test
	public void Convert99999Test() {
		assertEquals(Numbers.convertNumber(99999), "Ninety - Nine Thousand  Nine Hundred and Ninety - Nine");
	}
	
	@Test
	public void Convert2000000Test() {
		assertEquals(Numbers.convertNumber(2000000), "Two Million ");
	}
}

