package ex09_Cwicz9_2;

import java.util.Map.Entry;
import java.util.Scanner;

public class MainHandler implements UserInterface {

	private TravelOffice to;
	private Scanner scanner = null;

	public MainHandler(TravelOffice to) {
		this.to = to;
		scanner = new Scanner(System.in);
		scanner.useDelimiter("\r\n");
	}

	@Override
	public Customer addCustomer() {
		System.out.print("Customer first name? ");
		String fname = scanner.next();
		System.out.print("Customer last name? ");
		String lname = scanner.next();

		System.out.print("Customer street? ");
		String street = scanner.next();
		System.out.print("Customer zip? ");
		String zip = scanner.next();
		System.out.print("Customer city? ");
		String city = scanner.next();

		Address address = new Address(street, zip, city);
		Customer customer = new Customer(fname + " " + lname);
		customer.setAddress(address);
		to.addCustomer(customer);

		System.out.println("New customer has been created...\n");
		return customer;
	}

	@Override
	public Trip addTrip() {
		System.out.print("Trip id? ");
		String id = scanner.next();

		System.out.print("Trip destination? ");
		String destination = scanner.next();

		System.out.print("Trip start date (dd-mm-yyyy)? ");
		String start = scanner.next();
		Date startDate = Date.of(start, "-");

		System.out.print("Trip end date (dd-mm-yyyy)? ");
		String end = scanner.next();
		Date endDate = Date.of(end, "-");

		System.out.print("Trip price? ");
		int price = scanner.nextInt();

		System.out.print("Trip type (local/abroad)? ");
		String type = scanner.next();

		Trip trip = null;
		if (type.startsWith("a")) {
			System.out.print("Trip insurance? ");
			int insurance = scanner.nextInt();

			trip = new AbroadTrip(startDate, endDate, destination);
			trip.setPrice(price);
			((AbroadTrip) trip).setInsurance(insurance);
			to.addTrip(id, trip);
		} else {
			System.out.print("Trip own arrival discount? ");
			int discount = scanner.nextInt();

			trip = new DomesticTrip(startDate, endDate, destination);
			trip.setPrice(price);
			((DomesticTrip) trip).setOwnArrivalDiscount(discount);
			to.addTrip(id, trip);
		}

		System.out.println("New trip has been created...\n");
		return trip;
	}

	@Override
	public void assign() {
		System.out.print("Customer name? ");
		String name = scanner.next();

		Customer customer;
		try {
			customer = to.findCustomerByName(name);
		} catch (NoSuchCustomerException e) {
			System.out.println(e.getMessage() + "\n");
			return;
		}

		System.out.print("Trip id? ");
		String id = scanner.next();

		Trip trip = to.getTrips().get(id);
		if (trip == null) {
			System.out.println("No trip under id '" + id + "'\n");
			return;
		}
		customer.assignTrip(trip);
	}

	@Override
	public boolean removeCustomer() {
		System.out.print("Customer name? ");
		String customerName = scanner.next();

		Customer c;
		try {
			c = to.findCustomerByName(customerName);
			to.removeCustomer(c);
		} catch (NoSuchCustomerException e) {
			System.out.println(e.getMessage() + "\n");
			return false;
		}

		System.out.println("Customer has been removed...\n");
		return true;
	}

	@Override
	public boolean removeTrip() {
		System.out.print("Enter trip id: ");
		String id = scanner.next();
		try {
			to.removeTrip(id);
		} catch (NoSuchTripException e) {
			System.out.println("No such trip has been found\n");
			return false;
		}
		System.out.println("Trip has been removed...\n");
		return true;
	}

	@Override
	public void showTrips() {
		System.out.println("Trips list:");
		for (Entry<String, Trip> entry : to.getTrips().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
	}

	@Override
	public void showCustomers() {
		System.out.println("Customers list:");
		System.out.println(to);
	}

}
