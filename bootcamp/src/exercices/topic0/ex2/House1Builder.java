package exercices.topic0.ex2;

public class House1Builder implements HouseBuilder {

	private House house;

	public House1Builder() {
		house = new House();
	}

	@Override
	public void buildBathroom() {
		house.setBathroom("two with shower");
	}

	@Override
	public void buildBedroom() {
		house.setBedroom("three (one in suit)");
	}

	@Override
	public void buildGarage() {
		house.setGarage(false);
	}

	@Override
	public void buildLivingRoom() {
		house.setLivingRoom("one big");
	}

	@Override
	public void buildSquareFeet() {
		house.setSquareFeet(150);
	}

	@Override
	public House getHouse() {
		return house;
	}

}
