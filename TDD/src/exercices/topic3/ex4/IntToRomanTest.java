package exercices.topic3.ex4;

import static org.junit.Assert.*;

import org.junit.Test;

public class IntToRomanTest {

		@Test
		public void number1toITest() {
			assertEquals(new Convert("1").toRomanNumber(), "I");
		}

		@Test
		public void number5toVTest() {
			assertEquals(new Convert("5").toRomanNumber(), "V");
		}

		@Test
		public void number10toVTest() {
			assertEquals(new Convert("10").toRomanNumber(), "X");
		}

		@Test
		public void number50toLTest() {
			assertEquals(new Convert("50").toRomanNumber(), "L");
		}

		@Test
		public void number100toCTest() {
			assertEquals(new Convert("100").toRomanNumber(), "C");
		}

		@Test
		public void number500toDTest() {
			assertEquals(new Convert("500").toRomanNumber(), "D");
		}

		@Test
		public void number1000toMTest() {
			assertEquals(new Convert("1000").toRomanNumber(), "M");
		}

	}

