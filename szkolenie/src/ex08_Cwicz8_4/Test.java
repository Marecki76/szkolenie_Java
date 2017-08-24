package ex08_Cwicz8_4;

public class Test {

	public static void main(String[] args) {
		
		//• Klasa Test — klasa g³ówna zawieraj¹ca metodê main w której:
			
		
		//– utwórz tablicê obiektów Vehicle
		
//		– utwórz obiekty wszystkich typów i wstaw je do tablicy
		Vehicle v[] = new Vehicle[5];
		v[0] = new Car("Renault");
		v[1] = new Truck("Star");
		v[2] = new RaceCar("Porsche");
		v[3] = new Plane("Dreamliner");
		v[4] = new Ship("Titanic");	
		
		
		//	– w pêtli przegl¹daj tablicê i na rzecz ka¿dego obiektu wywo³aj metody go, stop i calculateFuelConsumption
		
		
		for (int i = 0; i < v.length; i++) {
			v[i].go();
			
			
			
//			– w pêtli sprawdŸ, czy bie¿¹cy obiekt jest typu Flying, jeœli tak – to dokonaj rzutowania referencji
			//	na Flying i wywo³aj metodê callAirControl
			
			if (v[i] instanceof Flying) {
				((Flying) v[i]).callAirControl();
			}
			
			
			v[i].stop();
			//System.out.println(v[i] + ", Efektywnoœæ: " + v[i].calculateFuelConsumption() + "\n");
			
			//v.stop();
					
			System.out.println("Efektywnoœæ: " + v[i].calculateFuelConsumption() + "\n");
		}
		
		
		
		

	}

}
