package exercices.topic0.ex2;

public class HouseDirector {
	
private HouseBuilder houseBuilder;
	
	public HouseDirector(HouseBuilder houseBuilder){
		this.houseBuilder = houseBuilder;
	}
	
	public void constructHouse() {
		houseBuilder.buildBathroom();
		houseBuilder.buildBedroom();
		houseBuilder.buildGarage();
		houseBuilder.buildLivingRoom();
		houseBuilder.buildSquareFeet();
	}
	
	public House getHouse() {
		return houseBuilder.getHouse();
	}

}
