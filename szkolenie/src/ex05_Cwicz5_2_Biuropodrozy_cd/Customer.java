package ex05_Cwicz5_2_Biuropodrozy_cd;

public class Customer {
	
	//atrybuty
	
	private String name; //imiê, nazwisko
	private Address address; //adres
	private Trip trip; //wycieczka, na któr¹ jedzie klient
	
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
    
   public String toString() {
	   
return String.format("%s%nAddress: %s%n%s" , name, address, trip);	   
   }
   //return String.format("from %s to %s, %s", start.getInfo(), end.getInfo(), destination);  
    
}
