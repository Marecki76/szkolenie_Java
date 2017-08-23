package ex04_cwicz4_6;

public class Test {

	public static void printNumbers(int n) {
		System.out.printf("TEST (%d pierwszych liczb ciagu Fibonacciego):%n", n);
		Fibonacci f = new Fibonacci();
		for (int i = 1; i <= n; i++) {
			long number = f.getNumber();
			int index = f.getIndex();
			System.out.printf("a[%2d] = %d%n", index, number);
		}
	}

	public static int countNumbers(int from, int to) {
		int counter = 0;
		long number;

		Fibonacci f = new Fibonacci();
		while ((number = f.getNumber()) <= to) {
			if (number >= from) {
				counter++;
				int index = f.getIndex();
				System.out.printf("a[%2d] = %d%n", index, number);
			}
		}
		return counter;
	}

	public static void main(String[] args) {
		// printNumbers(10);

		int lowerLimit = 1234;
		int upperLimit = 2345;
		int count = countNumbers(lowerLimit, upperLimit);
		System.out.printf("Ilosc liczb Fibonacciego znajdujacych sie w przedziale <%d; %d> wynosi: %d%n",
		        lowerLimit, upperLimit, count);
	}

}
