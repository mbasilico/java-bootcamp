package exercices.topic5.ex2;

public class Attendees {

	private String name;
	private int dni;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return this.name + ". dni: " + this.dni + "\n";
	}
}
