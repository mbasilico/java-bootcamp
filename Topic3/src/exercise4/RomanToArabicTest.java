package exercise4;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanToArabicTest {

	@Test
	public void testIto1() {
		assertEquals(new Roman("I").toArabic("I"),1);
	}
	
	@Test
	public void testIIto2() {
		assertEquals(new Roman("II").toArabic("II"),2);
	}
	
	@Test
	public void testVIIto7() {
		assertEquals(new Roman("VII").toArabic("VII"),7);
	}
	
	@Test
	public void testXXto20() {
		assertEquals(new Roman("XX").toArabic("XX"),20);
	}
	
	@Test
	public void testMDXXIto1521() {
		assertEquals(new Roman("MDXXI").toArabic("MDXXI"),1521);
	}
	
	@Test
	public void testMMMto3000() {
		assertEquals(new Roman("MMM").toArabic("MMM"),3000);
	}
	
	@Test
	public void testMMMCMXCIXto3999() {
		assertEquals(new Roman("MMMCMXCIX").toArabic("MMMCMXCIX"),3999);
	}
	

}
