
   /** "ConcreteBuilder" */
public class WoodenHouseBuilder extends HouseBuilder {

	
	public void buildMaterial() 
		{ house.setMaterial("Wood"); }

	
	public void buildFloors() {
		house.setFloors("1");
		
	}


	public void buildRooms() {
		house.setRooms("3");
		
	}
	
	public String toString() {
		return "Wood House :  " + house;

}
}	
