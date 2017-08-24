package ex07_Cwicz7_2;

public class Plane extends Vehicle implements Flying {

	public Plane(String name) {
		super(name);
	}

	@Override
	public void go() {
		super.go();
		takeOff(); // need to takeOff as well
	}

	@Override
	public void stop() {
		land(); // need to land before
		super.stop();
	}

	@Override
	public double getDistance() {
		return 400;
	}

	@Override
	public double getFuelNeeds() {
		return 100;
	}
}
