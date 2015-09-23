package exercise2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestWrappedWords {

	@Test
	public void testWrappWord() {
		assertEquals(WordWrapper2.wrapper("Hello Word!", 7), "Hello, Word!");
	}

	@Test
	public void testWrappWord2() {
		assertEquals(WordWrapper2.wrapper("Hello", 7), "Hello");
	}

	@Test
	public void testWrappWord3() {		
		assertEquals(WordWrapper2.wrapper("a b c d e f", 3), "a b, c d, e f");
	}

	@Test
	public void testWrappWord4() {
		assertEquals(WordWrapper2.wrapper("Excelent", 5), "Excel, ent");
	}

	@Test
	public void testWrappWord5() {
		assertEquals(WordWrapper2.wrapper("once upon a time bla bla", 60), "once upon a time bla bla");
	}

}
