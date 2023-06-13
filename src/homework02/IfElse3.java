package homework02;
import java.util.Scanner;
public class IfElse3 {
	int day;
	public void askTheDay() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ce zi este astazi ?");
		day = scan.nextInt();
		scan.close();
	}
	public void checkTheDay() {
		if (day == 0) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0.");
		}
		else if (day ==1) {
			System.out.println("Astazi este Luni.");
		}
		else if (day ==2) {
			System.out.println("Astazi este Marti.");
		}
		else if (day ==3) {
			System.out.println("Astazi este Miercuri.");
		}
		else if (day ==4) {
			System.out.println("Astazi este Joi.");
		}
		else if (day ==5) {
			System.out.println("Astazi este Vineri.");
		}
		else if (day ==6) {
			System.out.println("Astazi este Sambata.");
		}
		else if (day ==7) {
			System.out.println("Astazi este Duminica.");
		}
		else {
			System.out.println("Saptamana are doar 7 zile, te rog sa intoduci un numar valid !");
			}
	}
}
