package ex04_cwicz4_6;

//Klasa oblicza iloœæ liczb Fibonacciego znajduj¹cych siê w danym 
//przedziale
public class Fibonacci {
	int index = 0;
	long previous, next; // dwa kolejne elementy ciagu Fibonacciego

	public Fibonacci() {
		this.previous = 1L;
		this.next = 1L;
	}

	// zwraca kolejna wartosc ciagu
	public long getNumber() {
		if (++index <= 2) {
			return 1;
		}
		long newValue = previous + next;
		previous = next;
		next = newValue;
		return newValue;
	}

	// zwraca indeks elementu ciagu zwroconego przez metode getNumber
	public int getIndex() {
		return index;
	}

}
