package ex10;

public class NoSuchCustomerException extends Exception {
	private static final long serialVersionUID = 1L;

	public NoSuchCustomerException() {
	}

	public NoSuchCustomerException(String message) {
		super(message);
	}

}
