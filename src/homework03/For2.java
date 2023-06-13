package homework03;
import java.util.Scanner;
public class For2 {
	int numar;
	public void citireNumar() {
			Scanner scan = new Scanner(System.in);
			System.out.println("Te rog sa introduci numarul :");
			numar = scan.nextInt();
			scan.close();
	}
	public void afisareTablaInmultirii() {
		for (int i=0; i<10; i++) {
			System.out.println(numar + " * " + (i+1) +" = "+ (numar * (i+1)));
		}
	}	
}