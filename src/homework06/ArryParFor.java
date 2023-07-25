package homework06;

import java.util.Scanner;

public class ArryParFor {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		
		Integer[] arrayPar = new Integer[10];
		
		System.out.println("Introdu cele 10 numere : ");
		for (int i=0; i<10; i++) {
			arrayPar[i] = scan.nextInt();
		}
		
		System.out.println("Numerele pare din array (for) sunt urmatoarele : ");
		for (int i=0; i<10; i++) {
			if(arrayPar[i] % 2 ==0) {
				System.out.println(arrayPar[i] + " ");
			}
			
		}
		scan.close();
	}

}
