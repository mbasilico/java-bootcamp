package exercices.topic4.ex4;

import static org.junit.Assert.*;
import org.junit.Test;

public class UserServiceTest {

		@Test
		public void testAddToDB() {
			User u1 = new User(1);
			u1.setName("name 1");
			u1.setPassword("123");
			UserService serviceproxy = new UserServiceProxy(new UserServicePersisted());
			serviceproxy.addUser(u1);
			assertEquals(u1, serviceproxy.getUser(1));
		}
		
		@Test
		public void testRemoveUser() {
			User u1 = new User(1);
			u1.setName("name 1");
			u1.setPassword("123");
			User u2 = new User(2);
			u2.setName("name 2");
			u2.setPassword("456");
			UserService serviceproxy = new UserServiceProxy(new UserServicePersisted());
			serviceproxy.addUser(u1);
			serviceproxy.addUser(u2);
			serviceproxy.deleteUser(u1.getId());
			assertEquals(null, serviceproxy.getUser(1));
			assertEquals(u2, serviceproxy.getUser(2));
		}
		
		@Test
		public void testModifyDB() {
			User u1 = new User(1);
			u1.setName("name 1");
			u1.setPassword("123");
			UserService serviceproxy = new UserServiceProxy(new UserServicePersisted());
			serviceproxy.addUser(u1);
			u1.setName("updated name");
			serviceproxy.updateUser(u1);
			assertEquals("updated name", serviceproxy.getUser(u1.getId()).getName());
		}
}
