package ex09_Cwicz9_2;

public class NoSuchTripException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchTripException() {
	}

	public NoSuchTripException(String message) {
		super(message);
	}

}
