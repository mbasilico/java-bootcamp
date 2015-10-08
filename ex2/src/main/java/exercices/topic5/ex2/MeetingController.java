package exercices.topic5.ex2;


import java.util.ArrayList;

import org.hibernate.validator.valuehandling.UnwrapValidatedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/meetings")
@EnableAutoConfiguration
public class MeetingController {

	@Autowired
	ServiceMeetings service;

	@RequestMapping(value="/create",method = RequestMethod.POST)
	public void createMeeting() {
		service.newMeeting();
	}
	
	@RequestMapping(value="/",method = RequestMethod.GET)
	public ArrayList<Meeting> getMeeting() {
		return service.show();
	}

	@RequestMapping(value="/{idMeeting}/addAttendee", method=RequestMethod.POST)
	public void addAtt(@PathVariable int idMeeting,  @RequestBody Attendees a) {
		service.addAttendeeToMeeting(idMeeting-1, a);
	}
	
	@RequestMapping(value="/{idMeeting}/deleteAttendee", method=RequestMethod.DELETE)
	public void delAtt(@PathVariable int idMeeting,  @RequestBody Attendees a) {
		service.removeAttendeeFromMeeting(idMeeting-1, a);
	}

	@RequestMapping(value="/{idMeeting}/addRoom",method=RequestMethod.POST)
	public void addRoom(@PathVariable int idMeeting, @RequestBody Room room) {
		service.addRoomToMeeting(idMeeting-1, room);
	}
	
	@RequestMapping(value="/{idMeeting}/deleteRoom",method=RequestMethod.DELETE)
	public void delRoom(@PathVariable int idMeeting, @RequestBody Room room) {
		service.deleteRoomToMeeting(idMeeting-1, room);
	}
	
	@RequestMapping(value="/{idMeeting}/deleteMeeting",method=RequestMethod.DELETE)
	public void deleteM(@PathVariable int idMeeting){
		service.deleteMeeting(idMeeting-1);
	}
	
}
