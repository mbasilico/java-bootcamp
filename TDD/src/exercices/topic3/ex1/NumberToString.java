package exercices.topic3.ex1;

public class NumberToString {

	private static final String[] units = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
			"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	private static final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

	private static String converter(int n) {

		if (n < 20) {
			return units[n];
		}

		if (n < 100) {
			return tens[n / 10] + ((n % 10 != 0) ? "-" : "") + units[n % 10];
		}

		if (n < 1000) {
			return units[n / 100] + " hundred" + ((n % 100 != 0) ? " " : "") + converter(n % 100);
		}

		if (n < 1000000) {
			return converter(n / 1000) + " thousand" + ((n % 1000 != 0) ? " " : "") + converter(n % 1000);
		}

		if (n < 1000000000) {
			return converter(n / 1000000) + " million" + ((n % 1000000 != 0) ? " " : "") + converter(n % 1000000);
		}

		return converter(n / 1000000000) + " billion" + ((n % 1000000000 != 0) ? " " : "") + converter(n % 1000000000);
	}

	public static String convert(double amount) {
		String intpart = String.format("%.2f", amount);
		String decimal = decimalPart(intpart);
		intpart = intpart.substring(0, intpart.length() - 3);
		int integerPart = Integer.parseInt(intpart);
		intpart = converter(integerPart);
		return intpart + " and " + decimal;
	}

	private static String decimalPart(String intpart) {
		String decimal = intpart.substring(intpart.length() - 2, intpart.length());
		return decimal + "/100 dollars";
	}
}
