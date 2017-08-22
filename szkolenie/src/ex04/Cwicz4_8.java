package ex04;

import static java.lang.Character.*;
public class Cwicz4_8 {
	
	public static void main(String[] args) {
		
		String tekst = "Ala ma 2 koty, a koty maj¹ 1 Alê.";
		String wspak = "";
		for (int i = tekst.length()-1; i>=0; i--) {
			char znak = tekst.charAt(i);
			if (isLetter(znak)) {
				if (isUpperCase(znak)) {
				znak = toLowerCase(znak);	
				} else {
					znak = toUpperCase(znak);
							
				}
			}
		
			wspak += znak;
			
		}
		System.out.println(tekst);		
	    System.out.println(wspak);
	}
	

}
