package ex04_Cwicz4_9_Biuro_podrozy_dalej;

import ex03_date_cwicz3_3.Date;

public class Trip {

	
	//atrybuty
	
	Date start; //data wyjazdu
	Date end; //data powrotu
	String destination; //miejsce docelowe wycieczki
	
	
	//konstruktor
	
	public Trip(Date start, Date end, String destination) {
		this.start=start;
		this.end=end;
		this.destination=destination;
		
	}
	
	//metody
	public String getInfo() {
		return String.format("from %s to %s, %s", start, end, destination);
		
	
}
}