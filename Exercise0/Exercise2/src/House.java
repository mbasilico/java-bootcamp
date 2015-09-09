public class House {
	
	private String bedroom ="None";
	private String kitchen ="None";
	private String living ="None";
	private String bathroom ="None";
	private String garage ="None";
	private String basement ="None";
	
	public void setBedroom(String bedroom) { 
		this.bedroom = bedroom;
	}
	
	public void setKitchen(String kitchen) {
		this.kitchen = kitchen;
	}
	
	public void setLiving(String living) {
		this.living = living;
	}
	
	public void setBathroom(String bathroom) {
		this.bathroom = bathroom;
	}

	public void setGarage(String garage) {
		this.garage = garage;
	}
	
	public void setBasement(String basement) {
		this.basement = basement;
	}
	
	public String toString() {
	    return String.format( "%n Bedrooms: %s%n Kitchens: %s%n Living: %s%n Bathrooms: %s%n Garage: %s%n Basement: %s%n ", bedroom, kitchen, living, bathroom, garage, basement);
	}
}
