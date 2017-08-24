package ex07;

public abstract class Vehicle {

	private String name;

	
	//kreator konstruktora - Source -> Generatre Constructor using Fields
	public Vehicle(String name) {
		super();
		this.name = name;
	}

	 //przedefiniowuje metod� toString, tak, aby zwraca�a name

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	// � deklaruje metody abstrakcyjne getFuelNeeds i getDistance
	public abstract double getDistanse();  // nie ma klamry
	public abstract double getFuelNeeds();
	
	// � definiuje metod� calculateFuelConsumption wyliczaj�c� na podstawie wynik�w powy�szych
	//metod efektywno�� paliwow�
	
		public double calculateFuelConsumption() {
		return getFuelNeeds()/ getDistanse() * 100;
		
		}
	
	// � zdefiniuj metody go i stop, kt�re wy�wietlaj� informacj� o typie uruchomionego lub zatrzymanego
//		pojazdu oraz jego nazw� (wskaz�wka: skorzystaj z obiektu Class)
	
	public void go() {
	System.out.println(getClass().getSimpleName() + ": " + this + " started");
		
	// Class c = String.class;
	// Class c = object.getClass();
	// Class c = Class.forName("java.lang.String");
	}
	
	public void stop() {
	System.out.println(getClass().getSimpleName() + ": " + this + " stopped");	
	}
}
