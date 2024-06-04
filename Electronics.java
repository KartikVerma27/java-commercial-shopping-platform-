import java.sql.SQLException;
import java.util.Scanner;

public class Electronics {
	 static Scanner s= new Scanner(System.in);
	
	public static void electronic_data() throws InterruptedException, ClassNotFoundException, SQLException{
		System.out.println("1.)Logitech Keyboard:\n   $469\n   Only Three Left\n"
				+ "2.)Electronic Contact Spray:\n   $20\n   Free One Day Delivery\n"
				+ "3.)Oblivion OCD Writing Tablet:\n   $100\n   Only 2 Left\n"
				+ "Choose item");
		
		int item=s.nextInt();
		switch(item) {
		case 1: logitech_keyboard();
		break;
		case 2: electronic_spray();
		break;
		case 3: writing_tablet();
		break;
		}
	}
		public static  void logitech_keyboard() throws InterruptedException, ClassNotFoundException, SQLException {
			System.out.println("You have selected Logitech Keyboard\n"
					+ "Choose Quantity");
			int quantity=s.nextInt();
			double total=469*quantity;
			System.out.println("You have to pay: $"+total);
			Thread.sleep(4000);
			Payment_Mode p=new Payment_Mode();
			p.payment_Type();
			
			
	}
		public static void electronic_spray() throws InterruptedException, ClassNotFoundException, SQLException {
			System.out.println("You have selected Electronic Contact Spray\n"
					+ "Choose Quantity");
			int quantity=s.nextInt();
			double total=20*quantity;
			System.out.println("You have to pay: $"+total);
			Thread.sleep(4000);
			Payment_Mode p=new Payment_Mode();
			p.payment_Type();
			
		}
		public static void writing_tablet() throws InterruptedException, ClassNotFoundException, SQLException {
			System.out.println("You have selected Oblivion Writing Tablet Spray\n"
					+ "Choose Quantity");
			int quantity=s.nextInt();
			double total=100*quantity;
			System.out.println("You have to pay: $"+total);
			Thread.sleep(4000);
			Payment_Mode p=new Payment_Mode();
			p.payment_Type();
		}
		
		}


