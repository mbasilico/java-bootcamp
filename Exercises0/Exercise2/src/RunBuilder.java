
public class RunBuilder {

	public static void main(String[] args) {
		HouseBuilder houseBuilder = new HouseTwoBuilder();
		HouseDirector houseDirector = new HouseDirector (houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println(" HOUSE DESIGN 2" + house);
		
		houseBuilder = new HouseOneBuilder();
		houseDirector = new HouseDirector (houseBuilder);
		houseDirector.constructHouse();
		house = houseDirector.getHouse();
		System.out.println(" HOUSE DESIGN 1" + house);
		
		
		
		

	}

}
