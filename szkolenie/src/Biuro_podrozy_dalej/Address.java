package Biuro_podrozy_dalej;

public class Address {
	
	//atybuty
	
	String city; //miasto
	String zip; //kod pocztowy
	String street; //ulica
	
	//konstruktor
	
	public Address(String street, String zip, String city) {
		
		this.street=street;
		this.zip=zip;
		this.city=city;
		
	}

//metody
	
	public String getInfo() {
		return String.format("%s, %s %s", street, zip, city);
		
		
	}
	
}
