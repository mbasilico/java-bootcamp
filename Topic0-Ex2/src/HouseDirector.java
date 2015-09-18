  /** "Director" */
public class HouseDirector {
	private HouseBuilder houseBuilder;
	 
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;}
	
		public void setHouseBuilder(HouseBuilder hb)
    	{ houseBuilder = hb; }
    public House getHouse() 
    	{ return houseBuilder.getHouse(); }
 
    public void constructHouse() {
       houseBuilder.createNewHouse();
       houseBuilder.buildMaterial();
       houseBuilder.buildFloors();
       houseBuilder.buildRooms();

    }
}