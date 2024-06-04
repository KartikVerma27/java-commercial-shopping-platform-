import java.time.LocalDate;
import java.util.Scanner;

public class Payment {
	static Scanner s= new Scanner(System.in);
	public static void payment() {
		LocalDate date= LocalDate.now(); 
		System.out.println("Enter last six digits");
		int card_no=s.nextInt();
		System.out.println("Enter Expiry date");
		int exp=s.nextInt();
		System.out.println("Enter CVV");
		int cvv=s.nextInt();
		Credit_Debit cd = new Credit_Debit();
		if(card_no == cd.card_no  && exp == cd.exp && cvv == cd.cvv) {
			System.out.println("payment successfully");
			System.out.println("Order placed sucessfully on "+date);
			System.out.println("***Expected delivery between "+date.plusDays(4) +"to "+date.plusDays(7) +"***");
			
		}
		else
		{
			System.out.println("invalid card details\nplease enter valid card details");	
		}
	}
}
