package finalproyect;


public class Counter {

	private static int counterTransaction = 0;
	private static int counterCartID = 0;

	public static synchronized int getTransactionCount() {
		return counterTransaction;
	}

	public static synchronized void increaseTransactionCount() {
		counterTransaction++;
	}

	public static synchronized int getCartID() {
		return counterCartID;
	}

	public static synchronized void increaseCartID() {
		counterCartID++;
	}

}
