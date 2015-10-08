package exercices.topic5.ex2;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class ServiceMeetings {
	int counter=0;
	private ArrayList<Meeting> meetings;
	
	public ServiceMeetings(){
		this.meetings=new ArrayList<Meeting>();
	}
	
	public ArrayList<Meeting> getMeetings() {
		return meetings;
	}

	public void setMeetings(ArrayList<Meeting> meetings) {
		this.meetings = meetings;
	}
	
	public void addRoomToMeeting(int idMeeting , Room room) {
		this.meetings.get(idMeeting).setRooms(room);
	}

	public void addAttendeeToMeeting(int idMeeting, Attendees attendee){ 
		this.meetings.get(idMeeting).setAttendees(attendee);
	}

	public void newMeeting() {
		this.counter+=1;
		Meeting m=new Meeting();
		m.setNum(counter);
		this.meetings.add(m) ;
	
	}

	public void deleteMeeting(int idMeeting) {
		this.meetings.remove(idMeeting);
	}
	
	public ArrayList<Meeting> show() {
		return this.meetings;
		
	}

	public void removeAttendeeFromMeeting(int idMeeting, Attendees a) {
		this.meetings.get(idMeeting).deleteAtendee(a);
		
	}

	public void deleteRoomToMeeting(int idMeeting, Room room) {
		this.meetings.get(idMeeting).deleteRoom(room);
		
	}
}
