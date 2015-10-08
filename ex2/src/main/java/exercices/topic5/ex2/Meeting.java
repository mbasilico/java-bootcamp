package exercices.topic5.ex2;

import java.util.ArrayList;

public class Meeting {
	private int num;
	private ArrayList<Attendees> attendees;
	private ArrayList<Room> rooms;
	private TimeSlot timeSlot;

	public Meeting() {
		this.num=0;
		this.attendees = new ArrayList<Attendees>();
		this.rooms = new ArrayList<Room>();
		this.timeSlot = new TimeSlot();
	}
	
	public void deleteRoom (Room room){
		this.rooms.remove(room);
	}
	
	public void deleteAtendee(Attendees a) {
		this.attendees.remove(a);
		
	}
	
	public ArrayList<Attendees> getAttendees() {
		return this.attendees;
	}

	public void setAttendees(Attendees a) {
		this.attendees.add(a);
	}

	public ArrayList<Room> getRooms() {
		return rooms;
	}

	public void setRooms(Room rooms) {
		this.rooms.add(rooms);
	}

	public TimeSlot getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(TimeSlot timeSlot) {
		this.timeSlot = timeSlot;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	

}
