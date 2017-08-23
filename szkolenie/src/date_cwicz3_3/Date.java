package date_cwicz3_3;

public class Date {
	
	int year;
	int month;
	int day;
	
	
	
	public Date(int year, int month, int day) {
		
		this.year=year;
		this.month=month;
		this.day=day;
		
		
		
	}

	public String toString() { // zamiast getInfo dajemy toString i kasujemy getInfo w klasie Test
		//return year + "/" + month + "/" + day;
	return String.format("%d/%d/%d", year, month, day);	
	}
	
}
