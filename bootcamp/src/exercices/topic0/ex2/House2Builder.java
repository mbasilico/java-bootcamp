package exercices.topic0.ex2;

public class House2Builder implements HouseBuilder {

	private House house;

	public House2Builder() {
		house = new House();
	}

	@Override
	public void buildBathroom() {
		house.setBathroom("one");
	}

	@Override
	public void buildBedroom() {
		house.setBedroom("three commons");
	}

	@Override
	public void buildGarage() {
		house.setGarage(true);
	}

	@Override
	public void buildLivingRoom() {
		house.setLivingRoom("one little");
	}

	@Override
	public void buildSquareFeet() {
		house.setSquareFeet(300);
	}

	@Override
	public House getHouse() {
		return house;
	}

}
