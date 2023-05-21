package Homework3;
import java.util.Scanner;

public class TernaryOperator1 {
	int factura;
	int discount;
	public void valoareFactura () {
		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog sa introduci valoarea facturii : ");
		factura = scan.nextInt();
		scan.close();	
	}
	public void valoareDiscount() {
		if (factura > 0) {
			discount = (factura >= 100)?factura-factura*10/100:factura-factura*5/100;
			System.out.println("Valoarea facturii cu discount este: "+ discount);
		}
		else {System.out.println("Valoarea facturii nu este valida !");
		}
		
	}
}