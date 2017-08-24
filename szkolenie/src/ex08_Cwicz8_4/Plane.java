package ex08_Cwicz8_4;


// • Klasa Plane – dziedziczy po Vehicle, implementuje Flying
public class Plane extends Vehicle implements Flying {

	//– utwórz odpowiedni konstruktor
	
	public Plane(String name) {
		super(name);
		
	}

//	– zdefiniuj obie metody getFuelNeeds i getDistance
	// – zdefiniuj metody zadeklarowane w interfejsie — wypisanie informacji o wykonywanej operacji
	
	@Override
	public void takeOff() {
	System.out.println(this + " took off");	

	}

	@Override
	public void land() {
		System.out.println(this + " landed");		

	}

	@Override
	public void callAirControl() {
		System.out.println(this + " - zezwolenie na l¹dowanie");	

	}

	@Override
	public double getDistanse() {
		return 1_800;
	}

	@Override
	public double getFuelNeeds() { //zu¿ycie paliwa
		return 9_000;
	}

	
	
	
	
	//– przedefiniuj metody go i stop, tak, aby po wywo³aniu oryginalnego zachowania dodatkowo 
	// wo³a³a odpowiednio metody takeOff i land
	
	@Override
	public void go() {
		super.go();
		takeOff();
	}

	@Override
	public void stop() {
		land();
		super.stop();
	}

	
	
}
