package ex07;

public class RaceCar extends Car {
	
	// – napisz konstruktor ustawiaj¹cy name
	public RaceCar(String name) {
		super(name);
		
	}

	//	– zdefiniuj metodê getFuelNeeds	
	
	@Override
	public double getFuelNeeds() {
		
		return 100;
	}

	
}
