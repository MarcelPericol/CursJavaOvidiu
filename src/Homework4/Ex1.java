package Homework4;

import java.util.Scanner;

public class Ex1 {
	
	public static void main(String[] args) {
		String user;
		int pass;
		int counter = 0;
		
		do {
			Scanner scan  =  new Scanner(System.in);
			System.out.println("Please enter username :");
			user = scan.next();
			System.out.println("Please enter password :");
			pass = scan.nextInt();
			counter = counter +1;
			if (user.equals("TestUser") && pass ==1234) {
				System.out.println("Login Successful");
				break;
				}
			else if ((user.equals("TestUser") || pass !=1234) && counter < 3) {
				System.out.println("Login Error");
			}
			else {
				System.out.println("Maximum attempts reached. User blocked.");
				break;
			}
		} 
		while (counter < 4);
	}
}