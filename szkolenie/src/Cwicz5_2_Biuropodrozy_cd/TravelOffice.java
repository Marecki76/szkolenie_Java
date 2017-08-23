package Cwicz5_2_Biuropodrozy_cd;

public class TravelOffice {
	private Customer[] customers = new Customer[2];
	private int customerCount;
	
	
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
		public String toString() {
		
		String report = "";
		
		for (int i=0; i< customerCount; i++) {
			report += customers[i] + "\n";
			}
		return report;
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
