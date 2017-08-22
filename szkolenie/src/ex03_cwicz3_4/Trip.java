package ex03_cwicz3_4;

import date_cwicz3_3.Date;

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
		return String.format("from %s to %s, %s", start.getInfo(), end.getInfo(), destination);
		
	
}
}