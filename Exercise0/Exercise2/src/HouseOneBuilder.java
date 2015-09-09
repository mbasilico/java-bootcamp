
public class HouseOneBuilder extends HouseBuilder{
	
	/*private House house;
	
	public HouseOneBuilder() {
		house = new House();
	}*/

	@Override
	public void buildBedroom() {
		house.setBedroom("Bedroom A");
	}

	@Override
	public void buildKitchen() {
		house.setKitchen("Kitchen A");
		
	}

	@Override
	public void buildLiving() {
		house.setLiving("Living C");
	}

	@Override
	public void buildBathroom() {
		house.setBathroom("Bathroom B");
	}

	@Override
	public void buildGarage() {
		house.setGarage("Garage A");
	}

	@Override
	public void buildBasement() {
	}

	@Override
	public House getHouse() {
		return house;
	}
	
}
