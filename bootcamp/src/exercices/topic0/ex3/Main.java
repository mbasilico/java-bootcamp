package exercices.topic0.ex3;

public class Main {

	public static void main(String args[]) {
		HospitalBuilder hospitalBuilder = new UnHospitalBuilder();
		HospitalDirector hospitalDirector = new HospitalDirector(hospitalBuilder);
		hospitalDirector.constructHospital();
		Hospital hospital = hospitalDirector.getHospital();
		System.out.println(hospital);

	}

}
