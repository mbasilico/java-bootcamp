package exercise4;

public class Roman { // limit 3999

	public String arabic;

	protected Roman(String arabic) {
		this.arabic = arabic;
	}

	public int toArabic(String roman) {
		int arabic = 0; // this will be the result
		int last_digit = 0;
		int current_digit = 0;
		for (int i = 0; i < roman.length(); i++) {
			if (roman.charAt(i) == 'I') {
				current_digit = 1;
			}
			if (roman.charAt(i) == 'V') {
				current_digit = 5;
			}
			if (roman.charAt(i) == 'X') {
				current_digit = 10;
			}
			if (roman.charAt(i) == 'L') {
				current_digit = 50;
			}
			if (roman.charAt(i) == 'C') {
				current_digit = 100;
			}
			if (roman.charAt(i) == 'D') {
				current_digit = 500;
			}
			if (roman.charAt(i) == 'M') {
				current_digit = 1000;
			}

			if (last_digit < current_digit && last_digit != 0) {
				current_digit -= last_digit;
				arabic -= last_digit;
				arabic += current_digit;
				last_digit = current_digit;
				current_digit = 0;
			} else {
				last_digit = current_digit;
				arabic += current_digit;
				current_digit = 0;
			}
		}
		return arabic; 
	}
}
