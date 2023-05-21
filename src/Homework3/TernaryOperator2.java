package Homework3;
import java.util.Scanner;

public class TernaryOperator2 {
	int comision;
	int vanzari;
	public void valoareVanzari() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci valoarea vanzarilor : ");
		vanzari = scan.nextInt();
		scan.close();
	}
	public void valoareComision() {
		if (vanzari>2500) {
			comision = vanzari*5/100;
			System.out.println("Comisionul tau este "+ comision);
		}
		else {
			comision = 0;
			System.out.println("Comisionul tau este "+ comision);
		}
	}
}
