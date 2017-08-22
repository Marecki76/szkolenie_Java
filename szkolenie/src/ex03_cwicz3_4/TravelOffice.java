package ex03_cwicz3_4;

import date_cwicz3_3.Date;

public class TravelOffice {

	public static void main(String[] args) {
		
Date wyjazd = new Date(2017, 9, 1);
Date powrot = new Date(2017, 9, 15);
Trip wycieczka = new Trip(wyjazd, powrot, "Góry Sto³owe");
Customer klient = new Customer("Jan Kowalski");
Address adres = new Address("ul. Bracka", "12-584", "Kraków");
klient.setAddress(adres);
klient.assignTrip(wycieczka);


System.out.println(klient.getInfo());




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
