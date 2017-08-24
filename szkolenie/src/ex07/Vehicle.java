package ex07;

public abstract class Vehicle {

	private String name;

	
	//kreator konstruktora - Source -> Generatre Constructor using Fields
	public Vehicle(String name) {
		super();
		this.name = name;
	}

	 //przedefiniowuje metodê toString, tak, aby zwraca³a name

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	
	// – deklaruje metody abstrakcyjne getFuelNeeds i getDistance
	public abstract double getDistanse();  // nie ma klamry
	public abstract double getFuelNeeds();
	
	// – definiuje metodê calculateFuelConsumption wyliczaj¹c¹ na podstawie wyników powy¿szych
	//metod efektywnoœæ paliwow¹
	
		public double calculateFuelConsumption() {
		return getFuelNeeds()/ getDistanse() * 100;
		
		}
	
	// – zdefiniuj metody go i stop, które wyœwietlaj¹ informacjê o typie uruchomionego lub zatrzymanego
//		pojazdu oraz jego nazwê (wskazówka: skorzystaj z obiektu Class)
	
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
