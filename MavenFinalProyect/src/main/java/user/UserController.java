package user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {	
	
	
	public User newUser(String userName, String userPassword, String userShippingAdress){
		User user = new User();
		user.setUserName(userName);
		user.setUserPassword(userPassword);
		user.setUserShippingAdress(userShippingAdress);		
		return user;
	}

}
