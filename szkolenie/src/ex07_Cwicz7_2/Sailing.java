package ex07_Cwicz7_2;

public interface Sailing {

	default void dock() {
		System.out.println(this + " docked");
	}
}
