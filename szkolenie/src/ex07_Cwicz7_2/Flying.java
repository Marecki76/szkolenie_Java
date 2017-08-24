package ex07_Cwicz7_2;

public interface Flying {

	default void takeOff() {
		System.out.println(this + " took off");
	}

	default void land() {
		System.out.println(this + " landed");
	}

	default void callAirControl() {
		System.out.println(this + " requested clearance for landing");
	}
}
