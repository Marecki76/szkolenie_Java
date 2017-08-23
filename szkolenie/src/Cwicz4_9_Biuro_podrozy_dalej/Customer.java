package Cwicz4_9_Biuro_podrozy_dalej;

public class Customer {
	
	//atrybuty
	
	String name; //imiê, nazwisko
	Address address; //adres
	Trip trip; //wycieczka, na któr¹ jedzie klient
	
    public Customer(String name) {
		this.name=name;
	}
    
    //metody
    
    public void setAddress(Address address) {
    this.address=address;
    }
    
    public void assignTrip(Trip trip) {
    this.trip=trip;
    }
    
   public String getInfo() {
	   
return String.format("%s%nAddress: %s%n%s" , name, address.getInfo(), trip.getInfo());	   
   }
   //return String.format("from %s to %s, %s", start.getInfo(), end.getInfo(), destination);  
    
}
