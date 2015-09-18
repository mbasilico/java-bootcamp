/**a client build a house*/
public class BuilderHouse {

	public static void main(String[] args) {
		HouseBuilder houseBuilder = new WoodenHouseBuilder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println("Wooden House : " + house);

		houseBuilder = new OneRoomBuilder();
		houseDirector = new HouseDirector (houseBuilder);
		houseDirector.constructHouse();
		house = houseDirector.getHouse();
		System.out.println(" One-Room House: " + house);
     
   
	}
    
}
