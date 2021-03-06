package ex12;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Test {
	
	//logowanie
	
	public static void setup() {
		Logger logger = Logger.getLogger("ex12");
		logger.setLevel(Level.INFO);
		try {
			Handler handler = new FileHandler("log.txt");
			handler.setFormatter(new XMLFormatter());
			logger.addHandler(handler);
			
	
			
		} catch (SecurityException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Logger root = Logger.getLogger("");
		for (Handler h: root.getHandlers())
		{
		root.removeHandler(h);	
		}
	}

	public static void main(String[] args) {
		setup();
		
		// utworz biuro podrozy
		TravelOffice to = new TravelOffice();
		MainHandler mh = new MainHandler(to);

		Scanner scan = new Scanner(System.in);
		top: while (true) {
			System.out.println("SELECT OPTION:");
			System.out.println("1 - Add Customer");
			System.out.println("2 - Add trip");
			System.out.println("3 - Assign trip to customer");
			System.out.println("4 - Remove Customer");
			System.out.println("5 - Remove Trip");
			System.out.println("6 - Show Customers");
			System.out.println("7 - Show Trips");
			System.out.println("0 - Exit");
			int choice;
			if (scan.hasNextInt()) {
				choice = scan.nextInt();
			} else {
				scan.next(); // przeczytanie blednej danej z bufora
				continue;
			}
			switch (choice) {
			case 1:
				mh.addCustomer();
				break;
			case 2:
				mh.addTrip();
				break;
			case 3:
				mh.assign();
				break;
			case 4:
				mh.removeCustomer();
				break;
			case 5:
				mh.removeTrip();
				break;
			case 6:
				mh.showCustomers();
				break;
			case 7:
				mh.showTrips();
				break;
			case 0:
				break top;
			default:
				break;
			}
		}
		scan.close();
	}
}
