package ex07_Cwicz7_2;

public interface Moving {

	default void go() {
		System.out.println(getClass().getSimpleName() + ": " + this + " started");
	}

	default void stop() {
		System.out.println(getClass().getSimpleName() + ": " + this + " stopped");
	}
}
