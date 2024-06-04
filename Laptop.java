import java.sql.SQLException;
import java.util.Scanner;

public class Laptop {
	static Scanner s=new Scanner(System.in);
	public static void laptop_data() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("1.)HP Pavillion G16 Gaming Laptop:\n   $789.99\n   20% DISCOUNT WITH COUPON\n   Backlit Keyboard\n"
				+ "2.)BOAT Earphones\n   Now $75 insted of $100\n   Free Two-Day Delivery\n"
				+ "3.)Keyboard Film\n   $10\n   Order Now");
		int item=s.nextInt();
		switch(item) {
		case 1: hp();
		break;
		case 2: earphones();
		break;
		case 3:film();
		break;
		}
	}
	public static void hp() throws InterruptedException, ClassNotFoundException, SQLException{
		
			System.out.println("You have selected HP Pavillion G16 Gaming Laptop	\n"
					+ "Choose Quantity");
			int quantity=s.nextInt();
			double total=789.99*quantity;
			System.out.println("You have to pay: $"+total);
			Thread.sleep(4000);
			Payment_Mode p=new Payment_Mode();
			p.payment_Type();
		}
	public static void earphones() throws InterruptedException, ClassNotFoundException, SQLException{
		
		System.out.println("You have selected BOAT Earphones	\n"
				+ "Choose Quantity");
		int quantity=s.nextInt();
		double total=75*quantity;
		System.out.println("You have to pay: $"+total);
		Thread.sleep(4000);
		Payment_Mode p=new Payment_Mode();
		p.payment_Type();
	}
	public static void film() throws InterruptedException, ClassNotFoundException, SQLException{
		
		System.out.println("You have selected Keyboard Film	\n"
				+ "Choose Quantity");
		int quantity=s.nextInt();
		double total=10*quantity;
		System.out.println("You have to pay: $"+total);
		Thread.sleep(4000);
		Payment_Mode p=new Payment_Mode();
		p.payment_Type();
	}
	
}
