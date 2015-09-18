
  /** "ConcreteBuilder" */
public class OneRoomBuilder extends HouseBuilder {

	
	public void buildMaterial() 
	{ house.setMaterial("Cement"); }


public void buildFloors() {
	house.setFloors("1");
	
}


public void buildRooms() {
	house.setRooms("1");
	
}
public String toString() {
	return "One Room : " + house;
}
}
