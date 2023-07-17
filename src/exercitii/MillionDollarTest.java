package exercitii;
import java.util.Scanner;

public class MillionDollarTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci suma de pornire : ");
		double sumaStart = scan.nextDouble();
		System.out.println("Te rog sa introduci numarul de zile : ");
		int numarZile = scan.nextInt();
		double sumaFinala = sumaStart;
		
		for(int i=1; i < numarZile; i++) {
			sumaStart *= 2;
			sumaFinala = sumaFinala + sumaStart;
			System.out.println(sumaStart);
		}
		System.out.println("Suma totala este : " + sumaFinala);
	}
}
