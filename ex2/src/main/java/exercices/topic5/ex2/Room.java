package exercices.topic5.ex2;

import org.springframework.boot.orm.jpa.EntityScan;

@EntityScan
public class Room {
	private int num;
	private String name;
	private int capacity;
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Room " + num + ": " + name + ". Capacity: " + capacity;
	}

}
