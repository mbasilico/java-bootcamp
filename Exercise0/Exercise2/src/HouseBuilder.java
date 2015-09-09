//Types of rooms available: A,B,C
public abstract class HouseBuilder {
	protected House house; //is protected otherwise the concrete builders cant see it

	public abstract void buildBedroom();
	public abstract void buildKitchen();
	public abstract void buildLiving();
	public abstract void buildBathroom();
	public abstract void buildGarage();
	public abstract void buildBasement();
	public abstract House getHouse();
	
	public void createHouse(){  // instead of using this method, you can add in line 3: protected House house = new House ()
		house = new House();
	}
}
