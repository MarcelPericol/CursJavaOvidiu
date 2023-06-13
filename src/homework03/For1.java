package homework03;
import java.util.Scanner;
public class For1 {
	int numar;
	int sum=0;
	public void citireNumere() {
		Scanner scan = new Scanner(System.in);
		for (int i=1; i<=10; i++) {
			
			System.out.println("Te rog sa introduci numarul " + i);
			numar = scan.nextInt();
			sum += numar;
		}
		scan.close();
	}
	public void valoareSuma() {
		System.out.println("The sum of the numbers is : "+ sum);		
	}
}
