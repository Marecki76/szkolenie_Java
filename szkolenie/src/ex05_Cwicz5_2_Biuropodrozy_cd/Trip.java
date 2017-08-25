package ex05_Cwicz5_2_Biuropodrozy_cd;

import ex03_date_cwicz3_3.Date;

public class Trip {

	//atrybuty
	
	private Date start; //data wyjazdu
	private Date end; //data powrotu
	private String destination; //miejsce docelowe wycieczki
	private int price;
	
	//konstruktor
	    public Trip(Date start, Date end, String destination) {
		this.start=start;
		this.end=end;
		this.destination=destination;
}
	
	//metody
	public String toString() {
		return String.format("from %s to %s, %s, price: %d", start, end, destination, getPrice());
}
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}