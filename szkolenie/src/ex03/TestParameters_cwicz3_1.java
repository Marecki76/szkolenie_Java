package ex03;

import java.util.Date;

public class TestParameters_cwicz3_1 {

	public void changeValue(int a) {
		a = 10;
	}

	public void changeValue(String msg) {
		msg = "pies";
	}

	public void changeValue(Date data) {
		data.setTime(0);
	}

	public static void main(String[] args) {
		int a = 5;
		String msg = "kot";
		Date date = new Date();

		// wartosci poczatkowe
		System.out.println("WARTOSCI POCZATKOWE:");
		System.out.println("a    = " + a);
		System.out.println("msg  = " + msg);
		System.out.println("date = " + date);

		// aby wywolac metode na rzecz obiektu nalezy go najpierw utworzyc
		TestParameters_cwicz3_1 test = new TestParameters_cwicz3_1();
		test.changeValue(a);
		test.changeValue(msg);
		test.changeValue(date);

		// sprawdzenie wartosci
		System.out.println("\nWARTOSCI KONCOWE:");
		System.out.println("a    = " + a);
		System.out.println("msg  = " + msg);
		System.out.println("date = " + date);
	}
}
