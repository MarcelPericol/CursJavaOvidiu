package homework03;
import java.util.Scanner;
public class TernaryOperator3 {
	int punctaj;
	String calificativ;
	String rezultat;	
	public void askPunctaj() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci punctajul obtinut : ");
		punctaj = scan.nextInt();
		scan.close();
		calificativ = (punctaj >= 90)?"FB":(punctaj >= 80? "B": "S");
	}
	public void valoareRezultat() {
		rezultat = (calificativ=="FB")?"Ai primit: FoarteBine !":(calificativ=="B"?"Ai primit: Bine !":"Ai primit: Suficient !");
		System.out.println(rezultat);
		/*if (punctaj >= 0) {
			if (calificativ == "FB") {
			System.out.println("Ai primit : FoarteBine");
			}
			else if (calificativ == "B") {
				System.out.println("Ai primit : Bine");	
			}
			else {
				System.out.println("Ai primit : Suficient");	
			}
		}
		else {System.out.println("Valoarea punctajului nu este valida !");
		}*/
	}
}