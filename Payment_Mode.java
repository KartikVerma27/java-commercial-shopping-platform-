import java.sql.SQLException;
import java.util.Scanner;

public class Payment_Mode {
	Scanner sc=new Scanner(System.in);
	public void payment_Type() throws ClassNotFoundException, SQLException{
		System.out.println("Choose Payment method:\n"
				+ "1.)Credit/Debit\n"
				+ "2.)UPI\n"
				+ "3.)Cash on delivery");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:{
			Payment.payment();	
		}
		break;
		case 2:{
			Upi u=new Upi();
			u.payment();
		}
		break;
		case 3:{
			Cod c=new Cod();
			c.cash();
		}
		break;
		}
		
	}

}
