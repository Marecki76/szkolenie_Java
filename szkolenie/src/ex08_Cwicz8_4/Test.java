package ex08_Cwicz8_4;

public class Test {

	public static void main(String[] args) {
		
		//� Klasa Test � klasa g��wna zawieraj�ca metod� main w kt�rej:
			
		
		//� utw�rz tablic� obiekt�w Vehicle
		
//		� utw�rz obiekty wszystkich typ�w i wstaw je do tablicy
		Vehicle v[] = new Vehicle[5];
		v[0] = new Car("Renault");
		v[1] = new Truck("Star");
		v[2] = new RaceCar("Porsche");
		v[3] = new Plane("Dreamliner");
		v[4] = new Ship("Titanic");	
		
		
		//	� w p�tli przegl�daj tablic� i na rzecz ka�dego obiektu wywo�aj metody go, stop i calculateFuelConsumption
		
		
		for (int i = 0; i < v.length; i++) {
			v[i].go();
			
			
			
//			� w p�tli sprawd�, czy bie��cy obiekt jest typu Flying, je�li tak � to dokonaj rzutowania referencji
			//	na Flying i wywo�aj metod� callAirControl
			
			if (v[i] instanceof Flying) {
				((Flying) v[i]).callAirControl();
			}
			
			
			v[i].stop();
			//System.out.println(v[i] + ", Efektywno��: " + v[i].calculateFuelConsumption() + "\n");
			
			//v.stop();
					
			System.out.println("Efektywno��: " + v[i].calculateFuelConsumption() + "\n");
		}
		
		
		
		

	}

}
