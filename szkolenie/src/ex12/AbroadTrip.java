package ex12;

import java.time.LocalDate;

public class AbroadTrip extends Trip {
	private int insurance;

	public AbroadTrip(LocalDate start, LocalDate end, String destination) {
		super(start, end, destination);
	}

	@Override
	public int getPrice() {
		return super.getPrice() + insurance;
	}

	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}
}
