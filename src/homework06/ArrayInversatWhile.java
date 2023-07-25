package homework06;

import java.util.Scanner;

public class ArrayInversatWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Introdu dimensiunea array-ului : ");
		int dimensiune = scan.nextInt();
		
		Integer[] arrayInversat = new Integer[dimensiune];
		
		System.out.println("Introdu " + dimensiune + " numere : ");
		
		int i = 0;
		while (i < dimensiune) {
			arrayInversat[i] = scan.nextInt();
			i++;
		}
		
		int start = 0;
		int sfarsit = dimensiune - 1;
		while (start < sfarsit) {
			int temp = arrayInversat[start];
			arrayInversat[start] = arrayInversat[sfarsit];
			arrayInversat[sfarsit] = temp;
			start++;
			sfarsit--;
		
		}
		System.out.println("Array inversat cu While loop");
		i = 0;
		while(i<dimensiune) {
			System.out.println(arrayInversat[i]+ " ");
			i++;
		}
		scan.close();
	}

}
