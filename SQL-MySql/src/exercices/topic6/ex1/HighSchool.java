package exercices.topic6.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HighSchool {

	private Connection connection;

	public Connection connectDB() throws Exception {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/highschool", "highschool", "123456");
			return connection;
		} catch (Exception e) {
			throw e;
		}
	}

	/* List students and teachers for a given course. The output format should be:
		Course: <course-name>
		Teacher: <last-name>, <first-name>
		Students:
  			<last-name>, <first-name> (ordered by alphabetically by last name)
	 */
	public void printQuery4(ResultSet results) throws SQLException {
		System.out.println("-------------------------------------------------------------");
		if (results.next()) {
			System.out.println("Query 4");System.out.println();
			System.out.println("Course: " + results.getString(1));
			System.out.println("Teacher: " + results.getString(2) + ", " + results.getString(3));
			System.out.println("Students: ");
			System.out.println("\t" + results.getString(4) + " , " + results.getString(5));
			while (results.next()) {
				System.out.println("\t" + results.getString(4) + " , " + results.getString(5));
			}
		}
	}
	 
	//List final course notes for a given student note: I used the name because in my case reg num is Autoincrement and primary.
	//They should be ordered by highest notes and course name)
	public void printQuery5(ResultSet results) throws SQLException {
		System.out.println("-------------------------------------------------------------");
		if (results.next()) {
			System.out.println("Query 5");System.out.println();
			System.out.println("Student: " + results.getString(2) + " , " + results.getString(3));
			System.out.println("\t Course: " + results.getString(4));
			System.out.println("\t Final Note: " + results.getInt(5));
			while (results.next()) {
				System.out.println("\t Course: " + results.getString(4));
				System.out.println("\t Final Note: " + results.getInt(5));
			}
		}
	}

	// Percentage of students that passed/failed a given course.
	public void printQuery6(ResultSet results, int totalStudents) throws SQLException {
		System.out.println("-------------------------------------------------------------");
		if (results.next()) {
			System.out.println("Query 6");System.out.println();
			System.out.println("Course: " + results.getString(2));
			System.out.println("Student passed: " + results.getInt(3) + "  (" + results.getInt(3) * 100 / totalStudents	+ " %) ");
			System.out.println("Student failed: " + (totalStudents - results.getInt(3)) + "  ("
					+ (totalStudents - results.getInt(3)) * 100 / totalStudents + " %) ");
		}
	}

	/*For a given teacher, list the timeline for each course that he is assigned to (ordered by date), and the course name. The format should be:
	Teacher: <last-name>, <first-name>
	Schedule:
  		Monday 09:00 - 11:00: <course-name>
  		Monday 15:00 - 17:30: <course-name>
  		Friday 08:45 - 10:40: <course-name>
	*/
	public void printQuery7(ResultSet results) throws SQLException {
		System.out.println("-------------------------------------------------------------");
		if (results.next()) {
			System.out.println("Query 7");System.out.println();
			System.out.println("Teacher: " + results.getString(2) + " , " + results.getString(3));
			System.out.println("Schedule:");
			System.out.println("\t"+results.getString(4) + "   " + results.getString(5) + "  " + results.getString(6) + "  " + results.getString(7));
			while (results.next()) {
				System.out.println("\t"+results.getString(4) + "   " + results.getString(5) + "  " + results.getString(6) + "  " + results.getString(7));
			}
		}
	}
}