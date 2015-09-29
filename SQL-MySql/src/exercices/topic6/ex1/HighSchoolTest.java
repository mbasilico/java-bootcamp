package exercices.topic6.ex1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.BeforeClass;
import org.junit.Test;

public class HighSchoolTest {

	static HighSchool dbDao = new HighSchool();
	private static Connection connection;
	private static PreparedStatement query = null;
	private static ResultSet results;

	@BeforeClass
	// Clean DB
	public static void setup() throws Exception {
		connection = dbDao.connectDB();
		//connection.setAutoCommit(false);// Uncomment if dont you want to commit in db 
		query = connection.prepareStatement("DELETE FROM  highschool.studentxcourse");
		query.executeUpdate();
		query = connection.prepareStatement("DELETE FROM  highschool.coursexschedule");
		query.executeUpdate();
		query = connection.prepareStatement("DELETE FROM  highschool.student");
		query.executeUpdate();
		query = connection.prepareStatement("DELETE FROM  highschool.course");
		query.executeUpdate();
		query = connection.prepareStatement("DELETE FROM  highschool.teacher");
		query.executeUpdate();
		query = connection.prepareStatement("DELETE FROM  highschool.schedule");
		query.executeUpdate();
		
		// Add Schedules
		query = connection.prepareStatement("INSERT INTO highschool.schedule " + "(day, timefrom, timeto) "
				+ "VALUES('Lunes', '15:00:00', '20:00:00')," + "('Martes', '19:30:00', '22:30:00')," + "('Miercoles', '14:00:00', '18:00:00')," 
				+ "('Jueves', '17:30:00', '20:30:00')," + "('Viernes', '17:30:00', '20:30:00')");
		query.executeUpdate();
				
		// Add Teachers
		query = connection.prepareStatement("INSERT INTO highschool.teacher " + "(first_name, last_name, date_of_birth) "
				+ "VALUES('Teacher1', 'Teacher1', '1955-01-16')," + "('Teacher2', 'Teacher2', '1945-02-25')," + "('Teacher3', 'Teacher3', '1952-09-24')");
		query.executeUpdate();

		// Add Courses
		query = connection.prepareStatement("INSERT INTO highschool.course " + "(name, hours_by_week, idteacher) "
				+ "VALUES('Course1', 6, (SELECT idteacher FROM highschool.teacher WHERE last_name='Teacher3')),"
				+ "('Course2', 5, (SELECT idteacher FROM highschool.teacher WHERE last_name='Teacher1')),"
				+ "('Course3', 3, (SELECT idteacher FROM highschool.teacher WHERE last_name='Teacher2')),"
				+ "('Course4', 8, (SELECT idteacher FROM highschool.teacher WHERE last_name='Teacher2')),"
				+ "('Course5', 7, (SELECT idteacher FROM highschool.teacher WHERE last_name='Teacher1'))");
		query.executeUpdate();

		// Add Students
		query = connection.prepareStatement("INSERT INTO student" + "(first_name, last_name, date_of_birth) "
				+ "VALUES ('name1', 'last1', '1983-03-21')," + "('name2','last2','1982-10-08')," + "('name3','last3','1985-07-21'),"
				+ "('name4','last4','1980-03-13')," + "('name5','last5','1983-02-15')," + "('name6','last6','1983-11-17'),"
				+ "('name7','last7','1981-12-01')," + "('name8','last8','1982-03-04')," + "('name9','last9','1986-05-18'),"
				+ "('name10','last10','1986-03-13')," + "('name11','last11','1983-12-07')," + "('name12','last12','1984-07-30'),"
				+ "('name13','last13','1984-05-31')," + "('name14','last14','1983-01-30')," + "('name15','last15','1982-04-03'),"
				+ "('name16','last16','1985-08-16')," + "('name17','last17','1981-07-18')," + "('name18','last18','1980-03-29'),"
				+ "('name19','last19','1985-10-28')," + "('name20','last20','1985-08-07')," + "('name21','last21','1985-09-07'),"
				+ "('name22','last22','1985-10-24')," + "('name23','last23','1981-07-09')," + "('name24','last24','1981-01-18'),"
				+ "('name25','last25','1981-09-26')," + "('name26','last26','1986-07-22')," + "('name27','last27','1984-06-28'),"
				+ "('name28','last28','1982-07-26')," + "('name29','last29','1980-08-26')," + "('name30','last30','1983-02-22')");
		query.executeUpdate();
		
		// Add Students into Course 10 per course, and 20 only in course 5 
		query = connection.prepareStatement("INSERT INTO highschool.studentxcourse " + "(idstudent, idcourse, notep1, notep2, notep3, finalnote) "
				+ "VALUES((SELECT registration_number FROM highschool.student WHERE last_name='last1'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last2'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 7, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last3'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 8, 8, 8, 8),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last4'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 9, 8, 7, 8),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last5'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 6, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last6'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last7'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 5, 5, 5, 5),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last8'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 4, 4, 4, 4),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last9'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 3, 3, 6, 4),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last10'),(SELECT idcourse FROM highschool.course WHERE name='Course2'), 2, 2, 2, 2),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last7'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last8'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 6, 5, 7, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last9'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 8, 8, 8, 8),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last10'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last11'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 6, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last12'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 5, 5, 5, 5),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last13'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 4, 4, 4, 4),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last14'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 3, 3, 3, 3),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last15'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 2, 2, 2, 2),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last16'),(SELECT idcourse FROM highschool.course WHERE name='Course1'), 1, 1, 1, 1),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last17'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last23'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 6, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last18'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 6, 7, 5, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last24'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 8, 8, 8, 8),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last15'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 9, 9, 9, 9),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last22'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last3'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 3, 3, 3, 3),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last4'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 1, 1, 1, 1),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last5'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 3, 5, 4, 4),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last6'),(SELECT idcourse FROM highschool.course WHERE name='Course3'), 5, 7, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last12'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 6, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last13'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last14'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 6, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last18'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 6, 7, 5, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last19'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 8, 8, 8, 8),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last20'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last21'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 6, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last22'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 6, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last26'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 2, 2, 2, 2),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last25'),(SELECT idcourse FROM highschool.course WHERE name='Course4'), 1, 1, 1, 1),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last20'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 9, 9, 9, 9),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last21'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 7, 7, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last22'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 6, 6, 6, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last26'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 6, 7, 5, 6),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last25'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 8, 8, 8, 8),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last6'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 9, 9, 9, 9),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last23'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 1, 1, 1, 1),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last17'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 2, 2, 2, 2),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last14'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 5, 5, 5, 5),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last3'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 1, 1, 1, 1),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last24'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 8, 8, 8, 8),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last27'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 5, 5, 5, 5),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last28'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 3, 3, 3, 3),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last29'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 5, 6, 5, 5),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last30'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 8, 6, 7, 7),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last1'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 9, 10, 10, 10),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last2'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 1, 2, 3, 2),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last7'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 7, 5, 6, 2),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last4'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 5, 5, 5, 5),"
				+ "((SELECT registration_number FROM highschool.student WHERE last_name='last5'),(SELECT idcourse FROM highschool.course WHERE name='Course5'), 1, 1, 1, 1)");
		query.executeUpdate();

		// Assign schedules to courses
		query = connection.prepareStatement("INSERT INTO highschool.coursexschedule " + "(idcourse, idschedule, totalhours) "
				+ "VALUES((SELECT idcourse FROM highschool.course WHERE name='Course5'), (SELECT idschedule FROM highschool.schedule WHERE day='Martes'), 3),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course5'), (SELECT idschedule FROM highschool.schedule WHERE day='Jueves'), 3),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course2'), (SELECT idschedule FROM highschool.schedule WHERE day='Martes'), 3),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course2'), (SELECT idschedule FROM highschool.schedule WHERE day='Miercoles'), 4),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course3'), (SELECT idschedule FROM highschool.schedule WHERE day='Viernes'), 3),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course3'), (SELECT idschedule FROM highschool.schedule WHERE day='Miercoles'), 4),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course4'), (SELECT idschedule FROM highschool.schedule WHERE day='Martes'), 4),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course4'), (SELECT idschedule FROM highschool.schedule WHERE day='Jueves'), 3),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course1'), (SELECT idschedule FROM highschool.schedule WHERE day='Lunes'), 5),"
				+ "((SELECT idcourse FROM highschool.course WHERE name='Course1'), (SELECT idschedule FROM highschool.schedule WHERE day='Jueves'), 3)");
		query.executeUpdate();
	}

	@Test
	public void TestConnection() {
		Assume.assumeNotNull(dbDao);
	}

	@Test
	// List students and teachers for a given course. 
	// S = student , C = course , SC = studentxcourse , T = teacher
	public void TestQuery4() throws SQLException {
		query = connection.prepareStatement("SELECT C.name, T.last_name, T.first_name, S.last_name, S.first_name " + "FROM highschool.course AS C " 
				+ "INNER JOIN highschool.teacher AS T ON C.idteacher = T.idteacher "
				+ "INNER JOIN highschool.studentxcourse AS SC ON C.idcourse = SC.idcourse "
				+ "INNER JOIN highschool.student AS S ON SC.idstudent = S.registration_number "
				+ "WHERE C.name =? "
				+ "ORDER BY S.last_name");
		query.setString(1, "Course2");
		results = query.executeQuery();
		dbDao.printQuery4(results);
	}

	@Test
	// List final course notes for a given student note: I used the name because in my case reg num is Autoincrement and primary, and 
	// have no sense to have to search a student by reg num
	// S = student , C = course , SC = studentxcourse
	public void TestQuery5() throws SQLException {
		query = connection.prepareStatement("SELECT S.registration_number, S.last_name, S.first_name, C.name, SC.finalnote, SC.notep1, SC.notep2, SC.notep3 "
				+ "FROM highschool.student AS S "
				+ "INNER JOIN highschool.studentxcourse AS SC ON S.registration_number = SC.idstudent "
				+ "INNER JOIN highschool.course AS C ON SC.idcourse = C.idcourse "
				+ "WHERE S.registration_number = (SELECT registration_number FROM highschool.student WHERE last_name=?) "
				+ "ORDER BY SC.finalnote DESC, C.name ASC");
		query.setString(1, "last22");
		results = query.executeQuery();
		dbDao.printQuery5(results);
	}

	@Test
	// Percentage of students that passed/failed a given course.
	// C = course , SC = studentxcourse 
	public void TestQuery6() throws SQLException {
		query = connection.prepareStatement("SELECT C.idcourse, C.name, COUNT(*) AS total " + "FROM highschool.course AS C "
				+ "INNER JOIN highschool.studentxcourse AS SC ON C.idcourse = SC.idcourse " 
				+ "WHERE C.name = 'Course5'"
				+ "HAVING total");// Get total students
		results = query.executeQuery();
		if (results.next()) {
			int total = results.getInt(3);
			query = connection.prepareStatement("SELECT C.idcourse, C.name, COUNT(*) AS total "	+ "FROM highschool.course AS C " 
				+ "INNER JOIN highschool.studentxcourse AS SC ON C.idcourse = SC.idcourse "
				+ "WHERE (SC.finalnote >= 6) AND (C.name =?)" 
				+ "GROUP BY C.idcourse " + "HAVING total"); // Get passed ones
			query.setString(1, "Course5");
			results = query.executeQuery();
			dbDao.printQuery6(results, total);
		}
	}

	@Test
	// For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name
	// SCH = schedule , C = course , T = teacher , CS = coursexschedule
	public void TestQuery7() throws SQLException {
		query = connection.prepareStatement("SELECT T.idteacher, T.last_name, T.first_name, SCH.`DAY`, SCH.timefrom, SCH.timeto, C.name " + "FROM highschool.teacher AS T " 
				+ "INNER JOIN highschool.course AS C ON T.idteacher = C.idteacher "
				+ "INNER JOIN highschool.coursexschedule AS CS ON C.idcourse = CS.idcourse "
				+ "INNER JOIN highschool.schedule AS SCH ON CS.idschedule = SCH.idschedule " 
				+ "WHERE T.last_name =? " + "ORDER BY SCH.`DAY`,C.name");
		query.setString(1, "Teacher1");
		results = query.executeQuery();
		dbDao.printQuery7(results);
	}
	
	// Close connection after queries
	@AfterClass
	public static void closeConnection() throws SQLException {
		query.close();
		results.close();
		connection.close();
	}
}