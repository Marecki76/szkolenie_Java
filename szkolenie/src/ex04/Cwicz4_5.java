package ex04;

public class Cwicz4_5 {

	// Klasa oblicza ilosc liczb pierwszych znajdujacych sie w danym przedziale
	

		public static void main(String[] args) {
			int lowerLimit = 1234; // dolna granica przedzialu
			int upperLimit = 2345; // gorna granica przedzialu

			int count = countPrimes(lowerLimit, upperLimit);

			System.out.printf("Ilosc liczb pierwszych w przedziale <%d; %d>: %d%n",
			        lowerLimit, upperLimit, count);
		}

		public static int countPrimes(int from, int to) {
			int counter = 0; // licznik liczb pierwszych

			next: for (int i = from; i <= to; i++) {
				for (int j = 2; j * j <= i; j++) {
					if (i % j == 0) {
						continue next;
					}
				}
				counter++;
			}
			return counter;
		}

	}
