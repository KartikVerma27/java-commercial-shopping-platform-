import java.sql.SQLException;
import java.util.Scanner;

public class Commercial_Sites {
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException {
		Scanner s = new Scanner(System.in);
		System.out.println("***Commercial Sites***\n1.) Amazon\n2.) Flipkart\n3.) Alibaba\nEnter your choice:");
		int choice = s.nextInt();
		switch (choice) {
		case 1:
			Amazon a = new Amazon();
			a.Product_Details();
			break;
		case 2:
			Flipkart f = new Flipkart();
			f.Product_Details();
			break;
		case 3:
			Alibaba ab = new Alibaba();
			ab.Product_Details();
			break;
		}

	}

}
