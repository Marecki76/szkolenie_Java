package ex08_Cwicz8_4;

public class RaceCar extends Car {
	
	// � napisz konstruktor ustawiaj�cy name
	public RaceCar(String name) {
		super(name);
		
	}

	//	� zdefiniuj metod� getFuelNeeds	
	
	@Override
	public double getFuelNeeds() {
		
		return 100;
	}

	
}
