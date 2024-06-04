import java.time.LocalDate;

public class Cod {
	public static void cash() {
		LocalDate date= LocalDate.now();
		System.out.println("Order placed sucessfully on "+ date +"\n"
				+ "Share OTP (1598) at the time of delivery\n\n"
				+ "***Expected delivery between "+date.plusDays(4) +"to "+date.plusDays(7) +"***");
	}

}
