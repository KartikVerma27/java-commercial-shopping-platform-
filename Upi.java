import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Upi {
	static int pin=123;
	static Scanner s=new Scanner(System.in);
	public static void payment() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery("select * from upi");
		LocalDate date= LocalDate.now();
		System.out.println("Enter your UPI Id:");
		String id=s.next();
		System.out.println("Enter your Pin:");
		int pin=s.nextInt();
		if (pin==rs.getInt(2)) {
			System.out.println("Payment Sucessful");
			System.out.println("Order placed sucessfully on "+date);
			System.out.println("***Expected delivery between "+date.plusDays(4) +"to "+date.plusDays(7) +"***");
		}
		else {
			System.out.println("Enter vaild credentials");
		}
		
	}

}
