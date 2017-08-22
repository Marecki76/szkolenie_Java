package Biuro_podrozy_dalej;

import date_cwicz3_3.Date;

public class TravelOffice {
	Customer[] customers = new Customer[2];
	int customerCount;
	
	
	public void addCustomer(Customer customer) {
		
		if (customerCount == customers.length) {
			Customer[] temp = new Customer[customerCount + 2];
System.arraycopy(customers,0, temp, 0, customerCount);
	customers = temp;
		}
	customers[customerCount++] = customer;
	
	}

	public int getCustomerCount() {
		return customerCount;
		
	}
	
	public String getInfo() {
		
		String report = "";
		
		for (int i=0; i< customerCount; i++) {
			report += customers[i].getInfo() + "\n";
			}
		return report;
}
	
	public static void main(String[] args) {
	
		
	TravelOffice to = new TravelOffice();	
		
Date wyjazd = new Date(2017, 9, 1);
Date powrot = new Date(2017, 9, 15);
Trip wycieczka = new Trip(wyjazd, powrot, "Góry Sto³owe");



Customer klient = new Customer("Jan Kowalski");
Address adres = new Address("ul. Bracka", "12-584", "Kraków");
klient.setAddress(adres);
klient.assignTrip(wycieczka);
to.addCustomer(klient);

klient = new Customer("Anna Kowalska");
klient.setAddress(adres);
klient.assignTrip(wycieczka);
to.addCustomer(klient);

klient = new Customer("Tomek Kowalski");
klient.setAddress(adres);
klient.assignTrip(wycieczka);
to.addCustomer(klient);

klient = new Customer("Antek Kowalski");
klient.setAddress(adres);
klient.assignTrip(wycieczka);
to.addCustomer(klient);

System.out.println(to.getInfo());




//for (String[] s: msg) {
//	for(String s2: s) {
//		System.out.println(s2);
//	}
//}  

// pêtla for each - slajd 192
 
	}

}

//slajd 152

// 7 % (-4) = ?

// 7 / (-4) = -1
// 7 - (-1)*(-4) = 7-4 =3

// (-7) % 4 = ?
// -7 /4 = -1
// -7 - (-1) * 4 = -7 +4 = -3

// 7 /4 = 1
// 7.0 / 4 = 1.75


//slajd 185 , kod martwy

// public static boolean DEBUG = true

// if (DEBUG) {

 //}


// 
