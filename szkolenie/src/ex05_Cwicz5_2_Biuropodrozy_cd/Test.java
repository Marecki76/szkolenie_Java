package ex05_Cwicz5_2_Biuropodrozy_cd;

import ex03_date_cwicz3_3.Date;

public class Test {

	public static void main(String[] args) {
		
			
		TravelOffice to = new TravelOffice();	
			
	//Date wyjazd = new Date(2017, 9, 1);
	//Date powrot = new Date(2017, 9, 15);
	DomesticTrip wycieczkaKrajowa = new DomesticTrip(new Date(2017, 9, 1), new Date(2017, 9, 15), "Góry Sto³owe");
		
	wycieczkaKrajowa.setPrice(3_000);
	wycieczkaKrajowa.setOwnArriveDiscount(300);
	
	Customer klient = new Customer("Jan Kowalski");
	Address adres = new Address("ul. Bracka", "12-584", "Kraków");
	klient.setAddress(adres);
	klient.assignTrip(wycieczkaKrajowa);
	to.addCustomer(klient);
	
	
	
	//Date wyjazd1 = new Date(2017, 9, 1);
	//Date powrot1 = new Date(2017, 9, 15);
	AbroadTrip wycieczkaZagraniczna = new AbroadTrip(new Date(2017, 9, 1), new Date(2017, 9, 15), "Zanzibar");
	wycieczkaZagraniczna.setPrice(10_000);
	wycieczkaZagraniczna.setInsurance(200);
	
	klient = new Customer("Anna Kowalska");
	klient.setAddress(adres);
	klient.assignTrip(wycieczkaZagraniczna);
	to.addCustomer(klient);
	
	
	
	
	AbroadTrip wycieczkaZagraniczna1 = new AbroadTrip(new Date(2017, 9, 1), new Date(2017, 9, 15), "Zanzibar");
	wycieczkaZagraniczna1.setPrice(12_000);
	wycieczkaZagraniczna1.setInsurance(200);
	klient = new Customer("Tomek Kowalski");
	klient.setAddress(adres);
	klient.assignTrip(wycieczkaZagraniczna1);
	to.addCustomer(klient);
	
	//klient = new Customer("Antek Kowalski");
	//klient.setAddress(adres);
	//klient.assignTrip(wycieczka);
	//to.addCustomer(klient);
	
	System.out.println(to.toString());
	
	
	
	
	//for (String[] s: msg) {
	//	for(String s2: s) {
	//		System.out.println(s2);
	//	}
	//}  
	
	// pêtla for each - slajd 192
	 
		}

}
