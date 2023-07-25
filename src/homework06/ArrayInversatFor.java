package homework06;

import java.util.Scanner;

public class ArrayInversatFor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Introdu dimensiunea array-ului : ");
		int dimensiune = scan.nextInt();
		Integer[] arrayInversat = new Integer[dimensiune];
		
		System.out.println("Introdu " + dimensiune + " numere : ");
		for (int i=0; i<dimensiune; i++) {
			arrayInversat[i] = scan.nextInt();
		}
		
		for (int i = 0; i < dimensiune / 2; i++) {
			int temp = arrayInversat[i];
			arrayInversat[i] = arrayInversat[dimensiune-1-i];
			arrayInversat[dimensiune - 1 - i] = temp;	
		}
		System.out.println("Array inversat cu for loop");
		for (int i = 0; i < dimensiune; i++) {
			System.out.println(arrayInversat[i] + " ");
		}
		scan.close();
	}
}
