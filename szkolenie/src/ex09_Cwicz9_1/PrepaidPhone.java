package ex09_Cwicz9_1;

public class PrepaidPhone {
	
	private int limit;

	// starter
	
	public PrepaidPhone(int limit) {
		super();
		this.limit = limit;
	}
	
	public void makeCall(int min) throws PrepaidPhoneException {
		
		// dodajemy meesege
		
		if (min>limit) { // klasa wyj¹tku
			
			throw new PrepaidPhoneException("Rozmowa przekracza limit: " + limit + " min");
			
			
		}
		
		
		limit -= min;
		
		System.out.println("Romowa udana...");
          	
		
		
		}
	
// do³adowanie
	public void addToLimit(int min) {
		
		limit += min;

	}

	
	// stan konta
	public int getLimit() {
		return limit;
	}
	
	
	
	
	
}
