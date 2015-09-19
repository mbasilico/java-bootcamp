package exercise1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {

		System.out.println("What´s your name?");
		String input = "";
		Scanner inputScanner = new Scanner(System.in);
		input = inputScanner.nextLine();
		System.out.println("Hello: \"" + input + "\"");
		inputScanner.close();
	}
}
