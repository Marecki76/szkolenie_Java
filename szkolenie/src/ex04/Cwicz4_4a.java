package ex04;

public class Cwicz4_4a {

	public void countMultiples(int from, int to) {
		int counter7 = 0; // ilosc liczb podzielnych przez 7
		int counter13 = 0; // ilosc liczb podzielnych przez 13
		int counter29 = 0; // ilosc liczb podzielnych przez 29
		int counter43 = 0; // ilosc liczb podzielnych przez 43

		int counterAny = 0; // ilosc liczb podzielnych przez: 7 lub 13 lub 29
		                    // lub 43

		for (int i = from; i <= to; i++) {
			boolean multipleFound = false;
			if (i % 7 == 0) {
				counter7++;
				multipleFound = true;
			}
			if (i % 13 == 0) {
				counter13++;
				multipleFound = true;
			}
			if (i % 29 == 0) {
				counter29++;
				multipleFound = true;
			}
			if (i % 43 == 0) {
				counter43++;
				multipleFound = true;
			}

			if (multipleFound) {
				counterAny++;
			}
		}
		System.out.printf("W przedziale <%d; %d> znajduje siê liczb podzielnych: %n", from, to);
		System.out.println("przez  7: " + counter7);
		System.out.println("przez 13: " + counter13);
		System.out.println("przez 29: " + counter29);
		System.out.println("przez 43: " + counter43);
		System.out.println("przez przynajmniej jedna z powyzszych liczb: " + counterAny);
	}

	public static void main(String[] args) {
		 Cwicz4_4a c = new  Cwicz4_4a();
		c.countMultiples(1234, 2345);
	}
}
