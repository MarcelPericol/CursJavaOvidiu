package Homework3;
import java.util.Scanner;
public class For1 {
	int numar = 10;
	int sum=0;
	public void citireNumere() {
		for (int i=1; i<=10; i++) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Te rog sa introduci numarul " + i);
			numar = scan.nextInt();
			sum += numar;
		}
	}
	public void valoareSuma() {
		System.out.println("The sum of the numbers is : "+ sum);		
	}
}
