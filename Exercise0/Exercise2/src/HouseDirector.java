
public class HouseDirector {
	
	private HouseBuilder houseBuilder;
	
	public HouseDirector(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	
	public void constructHouse() {
		houseBuilder.createHouse();
		houseBuilder.buildBedroom();
		houseBuilder.buildKitchen();
		houseBuilder.buildLiving();
		houseBuilder.buildBathroom();
		houseBuilder.buildGarage();
		houseBuilder.buildBathroom();
	}
	
	public House getHouse() {
		return houseBuilder.getHouse();
	}
	

}
