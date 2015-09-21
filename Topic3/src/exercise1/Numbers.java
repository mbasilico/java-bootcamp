package exercise1;

import java.util.regex.Pattern;

public class Numbers {

	private static final String[] ZeroToNineteen = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
			"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };
	private static final String[] TwentyToNinety = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };
	private static final String[] BigOnes = { "hundred", "thousand", "million" };

	protected Numbers() {
	}

	public static String toText(double number) {
		int integer = (int) number;
		return integerPart(integer) + decimals(number) + " dollars";
		// dollars it could change to a field that ask for the type of currency
	}

	public static String decimals(double decimals) {
		String string = String.format("%.2f", decimals);
		String[] parts = string.split(Pattern.quote(",")); // split(Pattern.quote("."))
		String textDecimals = parts[1]; // should have decimals only
		return " and " + textDecimals + "/100";
	}

	public static String integerPart(int integer) { //supports to 999999
		if (integer < 0) {
			return "minus " + integerPart(-integer);
		}
		if (integer < 20) {
			return lessThanTwenty(integer);
		}
		if (integer < 100) {
			return lessThan100(integer);
		}
		if (integer < 1000) {
			return lessThanThousand(integer);
		}
		if (integer < 10000) {
			return lessThan10Thousand(integer);
		}
		if (integer < 100000) {
			return lessThan100Thousand(integer);
		}
		if (integer < 1000000) {
			return lessThanMillion(integer);
		}
		if (integer == 1000000) {
			return "number not supporter";
		} else {
			return "number not supporter";
		}
	}

	private static String lessThanMillion(int number) {
		if (number % 100 == 0) {
			return lessThanThousand(number / 1000) + " " + BigOnes[1];
		} else {
			return ZeroToNineteen[number / 100000] + " " + BigOnes[0] + " " + integerPart(number - 100000 * (number / 100000));
		}
	}

	private static String lessThan100Thousand(int number) {
		if (number % 100 == 0) {
			return integerPart(number / 1000) + " " + BigOnes[1];
		} else {
			return lessThan100(number / 1000) + " " + BigOnes[1] + " " + lessThanThousand(number - 1000 * (number / 1000));
		}
	}

	private static String lessThan10Thousand(int number) {
		if (number % 100 == 0) {
			return lessThanTwenty(number / 1000) + " " + BigOnes[1];
		} else {
			return lessThanTwenty(number / 1000) + " " + BigOnes[1] + " " + lessThanThousand(number - 1000 * (number / 1000));
		}
	}

	public static String lessThanThousand(int number) {
		if (number % 100 == 0) {
			return ZeroToNineteen[number / 100] + " " + BigOnes[0];
		} else {
			return integerPart(number / 100) + " " + BigOnes[0] + " " + lessThan100(number - 100 * (number / 100));
		}
	}

	public static String lessThan100(int number) {
		if (number % 10 == 0) {
			return TwentyToNinety[number / 10];
		} else {
			return TwentyToNinety[number / 10] + "-" + integerPart(number % 10);
		}
	}

	public static String lessThanTwenty(int number) {
		return ZeroToNineteen[number];
	}
}
