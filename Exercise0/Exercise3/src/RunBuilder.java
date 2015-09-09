
public class RunBuilder {

	public static void main(String[] args) {
		HospitalFactory hospitalFactory = new HospitalFactory();
		
		HospitalDesign design1 = hospitalFactory.getDesign("Design One");
		System.out.println("HOSPITAL DESIGN ONE:");
		design1.operationRoom();
		design1.clinicRoom();
		design1.laboratory();
		System.out.println();
		
		HospitalDesign design2 = hospitalFactory.getDesign("Design Two");
		System.out.println("HOSPITAL DESIGN TWO:");
		design2.operationRoom();
		design2.clinicRoom();
		design2.laboratory();
		
		

	}

}
