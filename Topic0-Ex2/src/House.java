
	/** Product */
	public class House {
		private String material = "";
	    private String NumberOfFloors = "0";
	    private String rooms = "0";
	 
	    
	    public String getMaterial() {
			return material;}
	    
		public String getFloors() {
			return NumberOfFloors;}
		
		public String getRooms() {
			return rooms;}
			
	    public void setMaterial(String material)     
	    	{ this.material = material; }
	    
	    public void setFloors(String string)     
	    	{ NumberOfFloors = string; }
	    
	    public void setRooms(String rooms)
	    	{ this.rooms = rooms; }
		
	    public String toString() {
			return ("[material= " + material + ", Number of Floors= " + NumberOfFloors + ", Rooms= " + rooms + "]");
		
		
	}
		}
