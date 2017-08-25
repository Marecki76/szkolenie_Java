package ex12;

import java.time.LocalDate;

public class DomesticTrip extends Trip {
	private int ownArrivalDiscount;

	public DomesticTrip(LocalDate start, LocalDate end, String destination) {
		super(start, end, destination);
	}

	@Override
	public int getPrice() {
		return super.getPrice() - ownArrivalDiscount;
	}

	public void setOwnArrivalDiscount(int ownArrivalDiscount) {
		this.ownArrivalDiscount = ownArrivalDiscount;
	}
}
