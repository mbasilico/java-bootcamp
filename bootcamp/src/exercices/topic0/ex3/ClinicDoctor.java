package exercices.topic0.ex3;

import java.util.ArrayList;

public class ClinicDoctor implements Doctor {
	private int MP;
	private String name;
	private ArrayList<String> patients;

	public int getMP() {
		return MP;
	}

	public void setMP(int mp) {
		MP = mp;
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

	public String toString() {
		return "Doctor: " + name + ", MP: " + MP + ", Patients: " + patients;
	}
}
