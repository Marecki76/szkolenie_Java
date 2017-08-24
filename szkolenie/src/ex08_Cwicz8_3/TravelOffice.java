package ex08_Cwicz8_3;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class TravelOffice {
	//private int customerCount = 0;
	private Set<Customer> customers = new HashSet<>();
	private Map<String, Trip> trips = new HashMap<>();
	
	
	
	
public Set<Customer> getCustomers() {
		return customers;
	}

	public Map<String, Trip> getTrips() {
		return trips;
	}

public void addTrip(String id, Trip trip) {
	
	trips.put(id, trip);
}
	
public void removeTrip(String id) {
	trips.remove(id);
}
	
	public void addCustomer(Customer customer) {
		
		customers.add(customer);
		
				//if (customerCount == customers.length) {
			//Customer temp[] = new Customer[customers.length + 2];
			//System.arraycopy(customers, 0, temp, 0, customers.length);
			//customers = temp;
		//}
		//customers[customerCount++] = customer;
	}

	public int getCustomerCount() {
		return customers.size();
	}

	@Override
	public String toString() {
		String report = "";
		for (Customer c: customers) {
			report += c + "\n";
		}
		
		
		//for (int i = 0; i < customerCount; i++) {
			//report += customers[i] + "\n";
		//}
		return report;
	}
}
