package exercices.topic0.ex3;

import java.util.ArrayList;

public class SpecialistDoctor implements Doctor {

	private int MS;
	private String name;
	private String specialty;
	private ArrayList<String> patients;

	public int getMS() {
		return MS;
	}

	public void setMS(int ms) {
		MS = ms;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public ArrayList<String> getPatients() {
		return patients;
	}

	public void setPatients(ArrayList<String> patients) {
		this.patients = patients;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String toString() {
		return "Doctor: " + name + ", MS: " + MS + ", Specialty: " + specialty + ", Patients: " + patients;
	}

}
