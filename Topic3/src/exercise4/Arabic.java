package exercise4;

public class Arabic { // limit 3999 in Romans

	public String toRoman(int arabic) {
		String roman = ""; // this will be the result

		String onesArray[] = { "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
		String tensArray[] = { "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String hundredsArray[] = { "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };

		// get the ones in the number
		int ones = arabic % 10;
		// get the tens
		arabic = (arabic - ones) / 10;
		int tens = arabic % 10;
		// get the hundreds
		arabic = (arabic - tens) / 10;
		int hundreds = arabic % 10;
		// get and write the thousands in the number to string
		arabic = (arabic - hundreds) / 10;
		for (int i = 0; i < arabic; i++) {
			roman += "M";
		}
		// write the hundreds
		if (hundreds >= 1) {
			roman += hundredsArray[hundreds - 1];
		}
		// write the tens
		if (tens >= 1) {
			roman += tensArray[tens - 1];
		}
		// write the ones
		if (ones >= 1) {
			roman += onesArray[ones - 1];
		}		
		return roman;
	}

}
