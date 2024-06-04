import java.sql.SQLException;
import java.util.Scanner;

public class Footwear {
	static Scanner s= new Scanner(System.in);
	public static void footwear() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("1.)Black & Grey men's Sneakrs:\n   $500\n   Fifteen Left\n"
				+ "2.)Grey Women's Sandals:\n   $97\n   Free One Day Delivery\n"
				+ "3.)Blue Converse:\n   $150\n   Only 2 Left\n"
				+ "Choose item");
		
		int item=s.nextInt();
		switch(item) {
		case 1: sneakrs();
		break;
		case 2: sandals();
		break;
		case 3: converse();
		break;
		}
	}
	public static void sneakrs() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("You have selected Black & Grey men's Sneakrs	\n"
				+ "Choose Quantity");
		int quantity=s.nextInt();
		System.out.println("Enter size:");
		int x=s.nextInt();
		double total=500*quantity;
		System.out.println("You have to pay: $"+total);
		Thread.sleep(4000);
		Payment_Mode p=new Payment_Mode();
		p.payment_Type();
	}
	public static void sandals() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("You have selected Grey Women's Sandals\n"
				+ "Choose Quantity");
		int quantity=s.nextInt();
		System.out.println("Enter size:");
		int x=s.nextInt();
		double total=97*quantity;
		System.out.println("You have to pay: $"+total);
		Thread.sleep(4000);
		Payment_Mode p=new Payment_Mode();
		p.payment_Type();	
	}
	public static void converse() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("You have selected Blue Converse\n"
				+ "Choose Quantity");
		int quantity=s.nextInt();
		System.out.println("Enter size:");
		int x=s.nextInt();
		double total=150*quantity;
		System.out.println("You have to pay: $"+total);
		Thread.sleep(4000);
		Payment_Mode p=new Payment_Mode();
		p.payment_Type();	
	}
	

}
