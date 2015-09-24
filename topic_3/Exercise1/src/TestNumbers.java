import static org.junit.Assert.*;

import org.junit.Test;

public class TestNumbers {

	@Test
	public void test() {
		NumberToWord num = new NumberToWord();
		assertEquals(num.convert(29),"twenty nine");
	}
}
