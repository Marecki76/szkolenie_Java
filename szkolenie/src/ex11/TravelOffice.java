package ex11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TravelOffice {
	private Set<Customer> customers = new HashSet<Customer>();
	private Map<String, Trip> trips = new HashMap<String, Trip>();

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}

	public void addTrip(String id, Trip trip) {
		trips.put(id, trip);
	}

	public Customer findCustomerByName(String name) throws NoSuchCustomerException {
		for (Customer c : customers) {
			if (c.toString().startsWith("Name: " + name + "\r\n")) {
				return c;
			}
		}
		throw new NoSuchCustomerException("No such customer has been found");
	}

	// public Customer findCustomerByName(String name) throws
	// NoSuchCustomerException {
	// for (Customer c : customers) {
	// if (Pattern.matches("Name: \\w+\\n", c.toString())) {
	// return c;
	// }
	// }
	// throw new NoSuchCustomerException("No such customer has been found");
	// }

	public boolean removeCustomer(Customer c) throws NoSuchCustomerException {
		if (c != null) {
			return customers.remove(c);
		}
		throw new NoSuchCustomerException("No such customer has been removed");
	}

	public boolean removeTrip(String id) throws NoSuchTripException {
		if (id != null) {
			if (trips.remove(id) == null) {
				throw new NoSuchTripException("No such trip has been removed");
			}
		}
		throw new NoSuchTripException("No such trip has been removed");
	}

	public int getCustomerCount() {
		return customers.size();
	}

	public Set<Customer> getCustomers() {
		return customers;
	}

	public Map<String, Trip> getTrips() {
		return trips;
	}

	@Override
	public String toString() {
		String report = "";
		for (Customer c : customers) {
			report += c + "\n";
		}
		return report;
	}
}
