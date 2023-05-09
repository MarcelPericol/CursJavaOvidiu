package Curs2;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		
		String username = "Test";
		int password = 1234;
		
		Scanner scan = new Scanner(System.in);		
		System.out.println("Te rog sa introduci utilizatorul :");
		String inputUsername = scan.next();
		inputUsername = inputUsername.substring(0,1).toUpperCase() + inputUsername.substring(1).toLowerCase();
		System.out.println("Te rog introdu parola :");
		int inputPassword = scan.nextInt();
		
		//string-urile se verifica cu metoda equals si nu cu ==
		//&& --AND
		//|| --ORt
		//boolean - true sau false
		if (username.equals(inputUsername) && password == inputPassword) {
			System.out.println("Logare efectuata cu succes");
			
		}else {
			System.out.println("Utilizatorul sau parola sunt gresite");
		}
	}

}
