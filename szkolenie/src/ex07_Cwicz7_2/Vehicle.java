package ex07_Cwicz7_2;

public abstract class Vehicle implements Moving, Fuel {
	private String name;

	protected Vehicle(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
