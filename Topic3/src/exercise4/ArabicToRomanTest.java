package exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class ArabicToRomanTest {

	@Test
	public void test1ToI() {
		assertEquals(new Arabic().toRoman(1), "I");
	}
	
	@Test
	public void test15ToXV() {
		assertEquals(new Arabic().toRoman(15), "XV");
	}
	
	@Test
	public void test24ToXXIV() {
		assertEquals(new Arabic().toRoman(24), "XXIV");
	}
	
	@Test
	public void test44ToXLIV() {
		assertEquals(new Arabic().toRoman(44), "XLIV");
	}
	
	@Test
	public void test144ToXLIV() {
		assertEquals(new Arabic().toRoman(144), "CXLIV");
	}
	
	@Test
	public void test1144ToMXLIV() {
		assertEquals(new Arabic().toRoman(1144), "MCXLIV");
	}
	
	@Test
	public void test3999ToMMMCMXCIX() {
		assertEquals(new Arabic().toRoman(3999), "MMMCMXCIX");
	}
	
	
	

}
