import static org.junit.Assert.*;

import org.junit.Test;

public class TDD {

	@Test
	public void test() {
		Converter converter =new Converter();
		assertEquals(converter.romanToInt("XX"),20);
		assertEquals(converter.romanToInt("MM"),2000);
		
		assertEquals(converter.toRoman(10),"X");
		assertEquals(converter.toRoman(2015),"MMXV");
		
	}

}
