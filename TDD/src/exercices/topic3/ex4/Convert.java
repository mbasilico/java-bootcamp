package exercices.topic3.ex4;

public class Convert {

	private String number;

	public Convert(String number) {
		this.number = number;
	}

	public String toRomanNumber() {
		return DecimalDigit.valueOf("n"+number).roman;
	}

	public int toDecimalNumber() {
		return Integer.parseInt(RomanDigit.valueOf(number).decimal);
	}

	enum RomanDigit {
		I("1"), V("5"), X("10"), L("50"), C("100"), D("500"), M("1000");

		private final String decimal;

		RomanDigit(String decimal) {
			this.decimal = decimal;
		}
	}

	public enum DecimalDigit {
		n1("I"), n5("V"), n10("X"), n50("L"), n100("C"), n500("D"), n1000("M");



		private final String roman;

		DecimalDigit(String roman) {
			this.roman = roman;
		}
	}
}
