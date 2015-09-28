package exercices.topic4.ex4;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserServiceDBTest {

	@Test
	public void testCreationUser() {
		User user = new User(1);
		user.setName("name 1");
		user.setPassword("123");
		assertEquals("name 1", user.getName());
		assertEquals("123", user.getPassword());
	}

	@Test
	public void testAddToDB() {
		SimulationDB db = SimulationDB.getinstance();
		User u1 = new User(1);
		u1.setName("name 1");
		u1.setPassword("123");
		User u2 = new User(2);
		u2.setName("name 2");
		u2.setPassword("456");
		db.addUser(u1);
		db.addUser(u2);
		assertEquals(u1, db.getUser(1));
		assertEquals(u2, db.getUser(2));
	}

	@Test
	public void testRemoveDB() {
		SimulationDB db = SimulationDB.getinstance();
		User u3 = new User(3);
		u3.setName("name 3");
		u3.setPassword("789");
		User u4 = new User(4);
		u4.setName("name 4");
		u4.setPassword("147");
		db.addUser(u3);
		db.addUser(u4);
		db.deleteUser(u3);
		db.deleteUser(u4);
		assertEquals(null, db.getUser(3));
		assertEquals(null, db.getUser(4));
	}

	@Test
	public void testModifyDB() {
		SimulationDB db = SimulationDB.getinstance();
		User u4 = new User(4);
		u4.setName("name 4");
		u4.setPassword("159");
		db.addUser(u4);
		u4.setName("name updated");
		db.modifyUser(u4);
		assertEquals("name updated", db.getUser(u4.getId()).getName());
	}

}
