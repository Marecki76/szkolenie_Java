package ex12;


	
	public class Test1 {
		
		
		private String memberVariable = "somedata";
		public static void main(String args[]) {
		// Aby miec dostep do pola nalezy stworzyc obiekt
		Test1 s = new Test1();
		System.out.println(s.memberVariable); // OK
		}
	
		}


