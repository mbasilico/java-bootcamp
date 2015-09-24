import static org.junit.Assert.*;

import org.junit.Test;

public class WordWrappTest {

	@Test
	public void testWrappWord() {
		assertEquals(WordWrapper.wrapper("Hello World!", 40), "Hello World!");
	}
	
	@Test
	public void testWrappWord1() {
		assertEquals(WordWrapper.wrapper("a b c d e f", 3), "a b , c d , e f");
	}
	
	@Test
	public void testWrappWord3() {
		assertEquals(WordWrapper.wrapper("Excelent", 5), "Excel , ent");
	}
	
	@Test
	public void testWrappWord4() {
		assertEquals(WordWrapper.wrapper("Hello World!", 7), "Hello , World!");
	}
	
	@Test
	public void testWrappWord5() {
		assertEquals(WordWrapper.wrapper("Lets make an example", 3), "Let , s , mak , e , an , exa , mpl , e");
	}
}

	
