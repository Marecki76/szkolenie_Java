package ex07_Cwicz7_2;

public class Car extends Vehicle {

	public Car(String name) {
		super(name);
	}

	@Override
	public double getDistance() {
		return 458;
	}

	@Override
	public double getFuelNeeds() {
		return 37;
	}
}
