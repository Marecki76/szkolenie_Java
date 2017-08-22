package ex04;

public class Cwicz4_2a {

	public static boolean isLeapYear(int year) {
		return (year % 400 == 0) || (year % 100 != 0) && (year % 4 == 0);
	}

	public static void testYear(int year) {
		System.out.printf("Rok %4d%s jest przestêpny%n", year, isLeapYear(year) ? "" : " nie");
	}

	public static void main(String[] args) {
		testYear(1900);
		testYear(2000);
		testYear(2017);
		testYear(2020);
	}

}
