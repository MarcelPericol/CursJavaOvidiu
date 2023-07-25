package homework06;

import java.util.Scanner;

public class ArrayParWhile {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			Integer[] arrayPar = new Integer[10];
			
			System.out.println("Introdu cele 10 numere : ");
			
			int i = 0;
			while (i < 10) {
				arrayPar[i] = scan.nextInt();
				i++;
			}
			
		
			System.out.println("Numerele pare din array (while) sunt urmatoarele : ");
			i = 0;
			while(i<10) {
				if(arrayPar[i] % 2 ==0) {
					System.out.println(arrayPar[i] + " ");
				}
				i++;
			}
			scan.close();

	}

}
