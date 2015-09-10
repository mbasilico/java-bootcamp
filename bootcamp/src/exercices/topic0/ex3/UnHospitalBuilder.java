package exercices.topic0.ex3;

import java.util.ArrayList;

public class UnHospitalBuilder implements HospitalBuilder {
	Hospital hospital;

	public UnHospitalBuilder() {
		hospital = new Hospital();
	}

	@Override
	public void buildName() {
		hospital.setName("Unhospital");

	}

	@Override
	public void buildDoctors() {
		ArrayList<Doctor> doctors = new ArrayList<Doctor>();
		DoctorFactory doctorFactory = new DoctorFactory();
		Doctor doc1 = doctorFactory.getDoctor("C");
		((ClinicDoctor) doc1).setName("Gonzalez");
		((ClinicDoctor) doc1).setMP(14552);
		ArrayList<String> patients = new ArrayList<String>();
		patients.add("Patient1");
		patients.add("Patient2");
		((ClinicDoctor) doc1).setPatients(patients);
		doctors.add(doc1);
		Doctor doc2 = doctorFactory.getDoctor("S");
		((SpecialistDoctor) doc2).setMS(0000);
		((SpecialistDoctor) doc2).setName("Hernandez");
		((SpecialistDoctor) doc2).setSpecialty("Neurólogo");
		((SpecialistDoctor) doc2).setPatients(patients);
		doctors.add(doc2);
		hospital.setDoctors(doctors);
	}

	@Override
	public void buildRooms() {
		ArrayList<Room> rooms = new ArrayList<Room>();
		Room room = new Room();
		room.setBedAmount(25);
		room.setNumber(4);
		rooms.add(room);
		Room room2 = new Room();
		room2.setBedAmount(10);
		room2.setNumber(2);
		rooms.add(room2);
		hospital.setRooms(rooms);

	}

	@Override
	public Hospital getHospital() {
		return hospital;
	}
}
