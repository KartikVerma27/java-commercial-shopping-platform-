import java.sql.SQLException;
import java.util.Scanner;

public class Clothing {
	static Scanner s= new Scanner(System.in);
	public static void clothing_data() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("1.)Zofey Umbrellas:\n   $73.97\n   20% DISCOUNT WITH COUPON\n   Selling Fast\n"
				+ "2.)Men's Black T-Shirt\n   Now $15 insted of $25\n   Free Two-Day Delivery\n"
				+ "3.)Raymond Grey Trouers\n   $50\n   Order Now");
		int item=s.nextInt();
		switch(item) {
		case 1: zofey_umbrellas();
		break;
		case 2: black_t();
		break;
		case 3: trousers();
		break;
		}
	}
	public static void zofey_umbrellas() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("You have selected Zofey Umbrellas\n"
			+ "Choose Quantity");
	int quantity=s.nextInt();
	double total=73.97*quantity;
	System.out.println("You have to pay: $"+total);
	Thread.sleep(4000);
	Payment_Mode p=new Payment_Mode();
	p.payment_Type();			
	}
	public static void black_t() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("You have selected Men's Black T-Shirt\n"
				+ "Choose Quantity");
		int quantity=s.nextInt();
		System.out.println("Enter size:");
		int x=s.nextInt();
		double total=15*quantity;
		System.out.println("You have to pay: $"+total);
		Thread.sleep(4000);
		Payment_Mode p=new Payment_Mode();
		p.payment_Type();
		
	}
	public static void trousers() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("You have selected RAYMOND GREY TROUSERS	\n"
				+ "Choose Quantity");
		int quantity=s.nextInt();
		System.out.println("Enter size:");
		int x=s.nextInt();
		double total=50*quantity;
		System.out.println("You have to pay: $"+total);
		Thread.sleep(4000);
		Payment_Mode p=new Payment_Mode();
		p.payment_Type();
	}
	

}
