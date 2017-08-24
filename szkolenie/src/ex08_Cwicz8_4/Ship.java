package ex08_Cwicz8_4;

// • Klasa Ship – dziedziczy po Vehicle, implementuje Saling


public class Ship extends Vehicle implements Sailing {
	// – utwórz odpowiedni konstruktor
	public Ship(String name) {
		super(name);
		
	}

	
	
	
	//– zdefiniuj metodê dock -– wypisanie informacji o przybyciu do portu
	
	
	
	@Override
	public void dock() {
		System.out.println(this + " zacumowa³");

	}
	//– zdefiniuj obie metody getFuelNeeds i getDistance
	@Override
	public double getDistanse() {
	
		return 4260;
	}

	@Override
	public double getFuelNeeds() {
		
		return 120_000;
	}

	//– przedefiniuj metodê stop, która zamiast zachowania z Vehicle wywo³uje metodê dock
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		dock();
	}
	
}
