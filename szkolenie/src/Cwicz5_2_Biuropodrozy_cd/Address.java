package Cwicz5_2_Biuropodrozy_cd;

public class Address {
	
	//atybuty
	
	// zamieniamy na private
	
	private String city; //miasto
	private String zip; //kod pocztowy
	private String street; //ulica
	
	//konstruktor
	
	public Address(String street, String zip, String city) {
		
		this.street=street;
		this.zip=zip;
		this.city=city;
		
	}

//metody
	
	public String toString() { // refaktoring - zmiana na toString
		return String.format("%s, %s %s", street, zip, city);
		
		
	}
	
}
