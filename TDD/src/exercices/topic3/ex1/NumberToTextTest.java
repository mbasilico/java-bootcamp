package exercices.topic3.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberToTextTest {

	@Test
	public void testNumberToString1() {
		assertEquals(numberToString.convert(1),"one");
	}

}
