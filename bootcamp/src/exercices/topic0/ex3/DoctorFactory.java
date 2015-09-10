package exercices.topic0.ex3;

public class DoctorFactory {
	public Doctor getDoctor(String type) {
		if ("C".equals(type))
			return new ClinicDoctor();
		if ("S".equals(type))
			return new SpecialistDoctor();
		return null;
	}

}
