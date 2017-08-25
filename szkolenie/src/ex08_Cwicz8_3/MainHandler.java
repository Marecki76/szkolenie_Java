package ex08_Cwicz8_3;

import java.util.Scanner;
import java.util.Map.Entry;

public class MainHandler implements UserInterface {

	private TravelOffice to;
	private Scanner sc;
	
	public MainHandler(TravelOffice to) {
		this.to = to;
		sc = new Scanner(System.in);
		sc.useDelimiter("\r\n");
	}

	@Override
	public Customer addCustomer() {
		System.out.print("Imiê? ");
		String firstName = sc.next();
		System.out.print("Nazwisko? ");
		String lastName = sc.next();
		System.out.print("Ulica? ");
		String street = sc.next();
		System.out.print("Kod pocztowy? ");
		String zip = sc.next();
		System.out.print("Miasto? ");
		String city = sc.next();
		
		Customer customer = new Customer(firstName + " " + lastName);
		Address address = new Address(street, zip, city);
		customer.setAddress(address);
		
		to.addCustomer(customer);
		
		System.out.println("Nowy u¿ytkownik zosta³ zaakceptowany...");
		
		return customer;
	}

	@Override
	public Trip addTrip() {
		
		System.out.print("ID wycieczki? ");
		String id = sc.next();
		System.out.print("Cel? ");
		String destination = sc.next();
		System.out.print("Start date (yyyy-mm-dd)? ");
		String start = sc.next();
		System.out.print("End date (yyyy-mm-dd)? ");
		String end = sc.next();
		
		Date startDate = Date.of(start, "-");
		Date endDate = Date.of(end, "-");
	
		System.out.print("Cena? ");
		int price = sc.nextInt();
		
		System.out.print("Typ wycieczki (a/1)? ");
		String type = sc.next();
		
		Trip trip;
		
		if ("a".equalsIgnoreCase(type)) {
			System.out.print("Ubezpieczenie? ");
			int insurance = sc.nextInt();
			
			trip = new AbroadTrip(startDate, endDate, destination);
			
			((AbroadTrip)trip).setInsurance(insurance);
						
			} else {
				System.out.print("W³asny koszt? ");
				int disount =sc.nextInt();
			trip = new DomesticTrip(startDate, endDate, destination);
				((DomesticTrip)trip).setOwnArrivalDiscount(disount);
				
				
							
			}
		trip.setPrice(price);
		to.addTrip(id, trip);	
		
		System.out.println("Nowa wycieczka zosta³a dodana...");
		return trip;
	}

	@Override
	public void assign() {
		System.out.print("Nazwa klienta? ");
		String name = sc.next();

		Customer customer = to.findCustomerByName(name);
		if (customer == null) {
			System.out.println("Nie znaleziono klienta o nazwisku '" + name + "'\n");
			return;
		}

		System.out.print("Trip id? ");
		String id = sc.next();

		Trip trip = to.getTrips().get(id);
		if (trip == null) {
			System.out.println("Pod tym id nie ma takiej wycieczki '" + id + "'\n");
			return;
		}
		customer.assignTrip(trip);
	}

	@Override
	public boolean removeCustomer() {
		System.out.print("Nazwa klienta? ");
		String customerName = sc.next();

		Customer c = to.findCustomerByName(customerName);
		if (c == null) {
			System.out.println("Nie znaleziono klienta o nazwisku\n");
			return false;
		}
		to.removeCustomer(c);

		System.out.println("Klient zosta³ usuniêty...\n");
		return true;
	}

	@Override
	public boolean removeTrip() {
		System.out.print("Wprowad¿ id wycieczki: ");
		String id = sc.next();
		boolean success = to.removeTrip(id);
		if (!success) {
			System.out.println("Nie znaleziono wycieczki\n");
			return false;
		}
		System.out.println("Wycieczka zosta³a usuniêta...\n");
		return true;
	}

	@Override
	public void showTrips() {
		System.out.println("Lista wycieczek:");
		for (Entry<String, Trip> entry : to.getTrips().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		System.out.println();
	}


	@Override
	public void showCustomers() {
		System.out.println("Lista klientów:");
		System.out.println(to);
	}

}
