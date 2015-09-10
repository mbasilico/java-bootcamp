package exercices.topic0.ex3;

public class Room {
	private int number;
	private int bedAmount;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getBedAmount() {
		return bedAmount;
	}

	public void setBedAmount(int bedAmount) {
		this.bedAmount = bedAmount;
	}

	public String toString() {
		return "Room number:" + number + ", has " + bedAmount + " beds";
	}

}
