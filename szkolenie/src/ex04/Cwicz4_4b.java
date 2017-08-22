package ex04;

public class Cwicz4_4b {

	public void countMultiples(int from, int to, int... divisors) {
		int size = divisors.length;
		int[] counters = new int[size + 1]; // tablica licznikow

		for (int i = from; i <= to; i++) {
			boolean multipleFound = false; // czy znaleziono wielokrotnosc
			                               // podzielnika
			for (int j = 0; j < size; j++) {
				if (i % divisors[j] == 0) {
					counters[j]++;
					multipleFound = true;
				}
			}
			if (multipleFound) {
				counters[size]++;
			}
		}

		// wypisanie wynikow
		System.out.printf("W przedziale <%d; %d> znajduje siê liczb podzielnych: %n", from, to);
		for (int i = 0; i < size; i++) {
			System.out.printf("przez %3d: %d%n", divisors[i], counters[i]);
		}
		System.out.println("przez przynajmniej jedna z powyzszych liczb: " + counters[size]);
	}

	public static void main(String[] args) {
		int size = args.length;
		if (size == 0) {
			System.out.println("Nie podano podzielnikow");
			return;
		}
		int[] divisors = new int[size]; // tablica podzielników

		// wczytanie do tablicy wartosci podzielnikow
		for (int i = 0; i < size; i++) {
			divisors[i] = Integer.parseInt(args[i]);
		}

		Cwicz4_4b c = new Cwicz4_4b();
		c.countMultiples(1234, 2345, divisors);
	}
}
