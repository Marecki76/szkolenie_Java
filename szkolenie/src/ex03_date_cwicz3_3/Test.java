package ex03_date_cwicz3_3;

public class Test {

	public static void main(String[] args) {
		
		
	Date start = new Date(2015, 7, 23);	
	Date end = new Date(2017, 7, 11);
	
	System.out.println(start);
	System.out.println(end);
		
	Date today;
	
	today = start;
	
	System.out.println(today);
	//wypisz warto�� obiektu do kt�rego odnosi si� today	
	
	
	today.year= 2016;
	today.day=17;
	//zmie� warto�� p�l year i day poprzez zmienn� today odpowiednio na 2016 i 17
	//ypisz warto�� obiekt�w do kt�rych odnosz� si� today i start
	System.out.println(today);
	System.out.println(start);
	
	//przypisz zmiennej end warto�� zmiennej today
	end=today;
	
	//� wypisz warto�� zmiennej end
	
	System.out.println(end);
		
	
	}

}
