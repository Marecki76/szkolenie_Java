package date_cwicz3_3;

public class Test {

	public static void main(String[] args) {
		
		
	Date start = new Date(2015, 7, 23);	
	Date end = new Date(2017, 7, 11);
	
	System.out.println(start.getInfo());
	System.out.println(end.getInfo());
		
	Date today;
	
	today = start;
	
	System.out.println(today.getInfo());
	//wypisz wartoœæ obiektu do którego odnosi siê today	
	
	
	today.year= 2016;
	today.day=17;
	//zmieñ wartoœæ pól year i day poprzez zmienn¹ today odpowiednio na 2016 i 17
	//ypisz wartoœæ obiektów do których odnosz¹ siê today i start
	System.out.println(today.getInfo());
	System.out.println(start.getInfo());
	
	//przypisz zmiennej end wartoœæ zmiennej today
	end=today;
	
	//– wypisz wartoœæ zmiennej end
	
	System.out.println(end.getInfo());
		
	
	}

}
