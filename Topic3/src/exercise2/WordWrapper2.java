package exercise2;

public class WordWrapper2 {
	
	public static String wrapper(String input, int rows) {
		if (input.length() <= rows) {
			return input;
		} else {
			String firstLine = input.substring(0, rows + 1);
			int space = firstLine.lastIndexOf(' ');
			if (space != -1) {
				return input.substring(0, space) + ", " + wrapper(input.substring(space + 1), rows);
			}
			if (input.charAt(rows) == ' ') {
				return input.substring(0, rows) + ", " + wrapper(input.substring(rows + 1), rows);
			}
			return input.substring(0, rows) + ", " + wrapper(input.substring(rows), rows);
		}
	}

}
