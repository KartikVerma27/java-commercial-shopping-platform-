import java.sql.SQLException;
import java.util.Scanner;

public class Flipkart {
	static Scanner s = new Scanner(System.in);
	public void Product_Details() throws InterruptedException, ClassNotFoundException, SQLException {
		System.out.println("Welcome to Flipkart\n1.)Electronics\n2.)Clothes and Umbrellas\n"
				+ "3.)Footwear\n4.)Laptops and Accesories\n5.)Exit\nChoose category");
		
		int choice= s.nextInt();
		switch(choice) {
		case 1:{ 
			Electronics e= new Electronics();
				e.electronic_data();
		}
		break;
		case 2: {
			Clothing c= new Clothing();
			c.clothing_data();
		}
		break;
		case 3: {
			Footwear f=new Footwear();
			f.footwear();
		}
		break;
		case 4: {
			Laptop l=new Laptop();
			l.laptop_data();
		}
		break;
		}	
	}
}
