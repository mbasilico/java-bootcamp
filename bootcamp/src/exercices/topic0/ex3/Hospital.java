package exercices.topic0.ex3;

import java.util.ArrayList;

public class Hospital {

	private String name;
	private ArrayList<Doctor> doctors;
	private ArrayList<Room> rooms;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Doctor> getDoctors() {
		return doctors;
	}

	public void setDoctors(ArrayList<Doctor> doctors) {
		this.doctors = doctors;
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public String toString() {
		return "Hospital:" + name + ", Doctors:" + doctors + "Rooms:" + rooms;
	}

}
