package ex05_Cwicz5_2_Biuropodrozy_cd;

import ex03_date_cwicz3_3.Date;

public class DomesticTrip extends Trip {
	
	private int ownArriveDiscount;
	

	public DomesticTrip(Date start, Date end, String destination) {
		super(start, end, destination);
		
	}


	public void setOwnArriveDiscount(int ownArriveDiscount) {
		this.ownArriveDiscount = ownArriveDiscount;
	}

	@Override
	public int getPrice() {
	return super.getPrice()- ownArriveDiscount;
	}
	
}
