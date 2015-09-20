package Topic2.exercise5.module2;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class TestMultiproject {
	public static void main(String[] args) {
		askName();
	}

	public static void askName() {
		System.out.println("What´s your name?");
		String input = "";
		Scanner inputScanner = new Scanner(System.in);
		input = inputScanner.nextLine();
		System.out.println("Hello: \"" + input + "\"");
		inputScanner.close();
	}
}