package ex08_Cwicz8_2;

public class DomesticTrip extends Trip {
	private int ownArrivalDiscount;

	public DomesticTrip(Date start, Date end, String destination) {
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
