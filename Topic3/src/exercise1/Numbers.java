package exercise1;

public class Numbers {

	private static final String[] ZeroToNineteen = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private static final String[] TwentyToNinety = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	private static final String[] BigOnes = { "hundred", "thousand", "million" };

	protected Numbers() {
	}

	public static String toText(double number) {

		int integer = (int) number;
		// int numberOfDigits = String.valueOf(integer).length();

		if (integer < 0) {
			return "minus " + toText(-integer);
		}
		if (number < 20) {
			return lessThanTwenty(integer);
		}
		if (number < 100) {
			return lessThan100(integer);
		}
		if (number < 1000) {
			return lessThanThousand(integer);
		}
		if (number < 10000) {
			return lessThan10Thousand(integer);
		}
		if (number < 100000) {
			return lessThan100Thousand(integer);
		}
		if (number < 1000000) {
			return lessThanMillion(integer);
		} else {
			return "not supported";
		}
	}

	private static String lessThanMillion(int number) {
		if (number % 100 == 0) {
			return lessThanThousand(number / 1000) + " " + BigOnes[1];
		} else {
			return ZeroToNineteen[number / 100000] + " " + BigOnes[0] + " " + toText(number - 100000 * (number / 100000));
		}
	}

	private static String lessThan100Thousand(int number) {
		if (number % 100 == 0) {
			return toText(number / 1000) + " " + BigOnes[1];
		} else {
			return lessThan100(number / 1000) + " " + BigOnes[1] + " " + lessThanThousand(number - 1000 * (number / 1000));
		}

	}

	private static String lessThan10Thousand(int number) {
		if (number % 100 == 0) {
			return lessThanTwenty(number / 1000) + " " + BigOnes[1];
		} else {
			return lessThanTwenty(number / 1000) + " " + BigOnes[1] + " " + lessThanThousand(number / 10);
		}
	}

	public static String lessThanThousand(int number) {
		if (number % 100 == 0) {
			return ZeroToNineteen[number / 100] + " " + BigOnes[0];
		} else {
			return toText(number / 100) + " " + BigOnes[0] + " " + lessThan100(number - 100 * (number / 100));
		}
	}

	public static String lessThan100(int number) {
		if (number % 10 == 0) {
			return TwentyToNinety[number / 10];
		} else {
			return TwentyToNinety[number / 10] + " " + toText(number % 10);
		}
	}

	public static String lessThanTwenty(int number) {
		return ZeroToNineteen[number];
	}

	public static int decimals(double toInteger) {

		return (int) toInteger;
	}

}
