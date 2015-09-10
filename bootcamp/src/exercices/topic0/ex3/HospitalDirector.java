package exercices.topic0.ex3;

public class HospitalDirector {
	private HospitalBuilder hospitalbuilder;

	public HospitalDirector(HospitalBuilder hospitalBuilder) {
		this.hospitalbuilder = hospitalBuilder;
	}

	public void constructHospital() {
		hospitalbuilder.buildName();
		hospitalbuilder.buildDoctors();
		hospitalbuilder.buildRooms();
	}

	public Hospital getHospital() {
		return hospitalbuilder.getHospital();

	}

}
