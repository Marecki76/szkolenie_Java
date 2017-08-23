package Cwicz5_2_Biuropodrozy_cd;

import date_cwicz3_3.Date;

public class AbroadTrip extends Trip {
	
	private int insurance;
	
	
	public AbroadTrip(Date start, Date end, String destination) {
		super(start, end, destination);
		
	}
	
	public void setInsurance(int insurance) {
		this.insurance = insurance;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return super.getPrice() + insurance;
	}

	
}
