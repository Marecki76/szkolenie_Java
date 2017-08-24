package ex08_Cwicz8_4;

// Klasa Car – dziedziczy po Vehicle, definiujemy przy tworzeniu klasy

public class Car extends Vehicle {
	
	
	//– napisz konstruktor ustawiaj¹cy name
	
	public Car(String name) {
		super(name);
	}

	// – zdefiniuj obie metody getFuelNeeds i getDistance
	
	@Override
	public double getDistanse() {
		return 530;
	}

	@Override
	public double getFuelNeeds() {
		return 70;
	}

}
