package exercices.topic0.ex2;

public class House {

	private float squareFeet;
	private Boolean garage;
	private String livingRoom;
	private String bedroom;
	private String bathroom;

	public Float getSquareFeet() {
		return squareFeet;
	}

	public void setSquareFeet(float squareFeet) {
		this.squareFeet = squareFeet;
	}

	public Boolean getGarage() {
		return garage;
	}

	public void setGarage(Boolean garage) {
		this.garage = garage;
	}

	public String getLivingRoom() {
		return livingRoom;
	}

	public void setLivingRoom(String livingRoom) {
		this.livingRoom = livingRoom;
	}

	public String getBedroom() {
		return bedroom;
	}

	public void setBedroom(String bedroom) {
		this.bedroom = bedroom;
	}

	public String getBathroom() {
		return bathroom;
	}

	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public String toString() {
		return " specs: Square Feets: " + squareFeet + ", Has garage: " + garage + ", Livingroom: " + livingRoom + ", Bedroom: " + bedroom
				+ ", Bathroom: " + bathroom;
	}

}
