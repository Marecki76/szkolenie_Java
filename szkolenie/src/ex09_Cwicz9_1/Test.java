package ex09_Cwicz9_1;

public class Test {

	public static void main(String[] args) {
		

		PrepaidPhone phone = new PrepaidPhone(10);
		
		for (int i=0; i <10; i++) {
			
			try {
				phone.makeCall(7);
			} catch (PrepaidPhoneException e) {
			//	e.printStackTrace(System.out);
				System.out.println("****** " + e.getMessage());
				
				phone.addToLimit(5);
			}
			phone.addToLimit(4);
			
			System.out.println("Obecny limit: " + phone.getLimit());
		}
		
	}

}
