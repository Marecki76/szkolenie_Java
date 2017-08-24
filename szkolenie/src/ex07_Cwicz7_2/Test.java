package ex07_Cwicz7_2;

public class Test {

	public static void main(String[] args) {
		Vehicle vehicles[] = new Vehicle[5];
		vehicles[0] = new Car("Ford");
		vehicles[1] = new RaceCar("Porsche");
		vehicles[2] = new Truck("Star");
		vehicles[3] = new Plane("Dreamliner");
		vehicles[4] = new Ship("Titanic");

		for (Vehicle v : vehicles) {
			v.go();

			if (v instanceof Plane) {
				((Plane) v).callAirControl();
			}

			v.stop();
			System.out.println(v + ", fuel consumption: " + v.calculateFuelConsumption() + "\n");
		}
	}
}
