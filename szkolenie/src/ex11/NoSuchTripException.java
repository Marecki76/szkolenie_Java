package ex11;

public class NoSuchTripException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchTripException() {
	}

	public NoSuchTripException(String message) {
		super(message);
	}

}
