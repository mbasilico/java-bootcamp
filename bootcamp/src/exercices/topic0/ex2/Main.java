package exercices.topic0.ex2;

public class Main {

	public static void main(String[] args) {

		HouseBuilder houseBuilder = new House1Builder();
		HouseDirector houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		House house = houseDirector.getHouse();
		System.out.println("House 1" + house);

		houseBuilder = new House2Builder();
		houseDirector = new HouseDirector(houseBuilder);
		houseDirector.constructHouse();
		house = houseDirector.getHouse();
		System.out.println(" House 2" + house);

	}
}
