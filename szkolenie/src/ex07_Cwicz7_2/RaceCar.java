package ex07_Cwicz7_2;

public class RaceCar extends Car {

	public RaceCar(String name) {
		super(name);
	}

	@Override
	public double getFuelNeeds() {
		return 47;
	}
}
