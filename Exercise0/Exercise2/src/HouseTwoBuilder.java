
public class HouseTwoBuilder extends HouseBuilder{

	/*private House house;
	
	public HouseTwoBuilder() {
		
		house = new House();
	}*/

	@Override
	public void buildBedroom() {
		house.setBedroom("Bedroom A, Bedroom C");
	}

	@Override
	public void buildKitchen() {
		house.setKitchen("Kitchen A");
		
	}

	@Override
	public void buildLiving() {
		house.setLiving("Living B");
	}

	@Override
	public void buildBathroom() {
		house.setBathroom("Bathroom A, Bathroom A");
	}

	@Override
	public void buildGarage() {
		house.setGarage("Garage B");
	}

	@Override
	public void buildBasement() {
		
	}

	@Override
	public House getHouse() {
		return house;
	}
}
