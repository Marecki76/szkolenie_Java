package ex08_Cwicz8_4;

// � Klasa Ship � dziedziczy po Vehicle, implementuje Saling


public class Ship extends Vehicle implements Sailing {
	// � utw�rz odpowiedni konstruktor
	public Ship(String name) {
		super(name);
		
	}

	
	
	
	//� zdefiniuj metod� dock -� wypisanie informacji o przybyciu do portu
	
	
	
	@Override
	public void dock() {
		System.out.println(this + " zacumowa�");

	}
	//� zdefiniuj obie metody getFuelNeeds i getDistance
	@Override
	public double getDistanse() {
	
		return 4260;
	}

	@Override
	public double getFuelNeeds() {
		
		return 120_000;
	}

	//� przedefiniuj metod� stop, kt�ra zamiast zachowania z Vehicle wywo�uje metod� dock
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		dock();
	}
	
}
