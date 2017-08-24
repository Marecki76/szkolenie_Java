package ex07_Cwicz7_2;

public interface Fuel {

	double getFuelNeeds();

	double getDistance();

	default double calculateFuelConsumption() {
		return Math.round(getFuelNeeds() / getDistance() * 100);
	}
}
