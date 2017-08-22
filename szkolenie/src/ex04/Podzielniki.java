package ex04;

public class Podzielniki {

	public static void main(String[] args) {
		
		int licznik7 = 0;
		int licznik13 = 0;
		int licznik29 = 0;
		int licznik43 = 0;
		int licznik = 0;
		for (int liczba = 1234; liczba <= 2345; liczba++) {
			if (liczba % 7 == 0) {
				licznik7++;
			}
			
			if (liczba % 13 == 0) {
				licznik13++;
			}
			
			if (liczba % 29 == 0) {
				licznik29++;
			}

			if (liczba % 43 == 0) {
				licznik43++;
			}
			
			if (liczba % 7 == 0 || liczba % 13 == 0 || liczba % 29 ==0 || liczba % 43 ==0) {
				licznik++;
			}	
			
		}
		System.out.println("Znaleziono " + licznik7 + " wielokrotnoœci 7");
		System.out.println("Znaleziono " + licznik13 + " wielokrotnoœci 13");
		System.out.println("Znaleziono " + licznik29 + " wielokrotnoœci 29");
		System.out.println("Znaleziono " + licznik43 + " wielokrotnoœci 43");
		System.out.println("Znaleziono " + licznik + " wielokrotnoœci 7 lub 13 lub 29 lub 43");
	}
	
}
