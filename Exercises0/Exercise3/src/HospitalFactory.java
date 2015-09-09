
public class HospitalFactory {
	
	public HospitalDesign getDesign(String design){
		
		if (design.equals("Design One")){
			return new HospitalOne();
		}
		if (design.equals("Design Two")){
			return new HospitalTwo();
		}
		return null;
	}
}