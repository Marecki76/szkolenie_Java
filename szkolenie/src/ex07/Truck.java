package ex07;

public class Truck extends Car {

	// – napisz konstruktor ustawiaj¹cy name
	public Truck(String name) {
		super(name);
		
	}
//	– zdefiniuj metodê getFuelNeeds	
	
	@Override
	public double getFuelNeeds() {
		// TODO Auto-generated method stub
		return 110;
	}



	
}
