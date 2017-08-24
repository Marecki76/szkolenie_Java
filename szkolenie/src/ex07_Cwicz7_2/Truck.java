package ex07_Cwicz7_2;

public class Truck extends Car {

	public Truck(String name) {
		super(name);
	}

	@Override
	public double getFuelNeeds() {
		return 57;
	}
}
