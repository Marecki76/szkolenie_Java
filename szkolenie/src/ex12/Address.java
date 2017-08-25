package ex12;

public class Address {
	String street;
	String zip;
	String city;

	public Address(String street, String zip, String city) {
		this.street = street;
		this.zip = zip;
		this.city = city;
	}

	@Override
	public String toString() {
		return String.format("%s, %s %s", street, zip, city);
	}
}
