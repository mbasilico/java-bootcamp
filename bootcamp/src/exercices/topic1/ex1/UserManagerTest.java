package exercices.topic1.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserManagerTest {

	@Test
	public void userMTest() {
		User user = new User("user","123");
		User user2 = new User("user","123");
		User user3 = new User("anotherUser","12223");
		User user4 = new User("1moreUser","7878");
		User user2Up = new User("anUpdate ","567");
		UserManager userM = new UserManager();
		userM.addNewUser(user);
		assertEquals(userM.users.size(),1);
		userM.addNewUser(user2);
		userM.addNewUser(user3);
		assertEquals(userM.users.size(),2); //Must be 2 because user 2 is already un db
		userM.listUsers(userM.getUsers());
		System.out.println();
		userM.deleteUser(user);
		assertEquals(userM.users.size(),1);
		userM.addNewUser(user4);
		userM.listUsers(userM.getUsers());
		System.out.println();
		userM.updateUser(user3, user2Up);
		assertEquals(userM.getUser(user3).getUserName(),user2Up.getUserName());
		assertEquals(userM.getUser(user3).getPassword(),user2Up.getPassword());
		userM.listUsers(userM.getUsers());
	}

}
