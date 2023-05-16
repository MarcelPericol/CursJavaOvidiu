package Curs3;

import java.util.Scanner;

public class ParSauImpar {

	int number;
	public void askTheUserForANumber() {
		
		System.out.println("Please enter a number:");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
	}
	
	public void checkNumberIsOddOrEven () {
		askTheUserForANumber();
		
		
		if(number % 2 == 0) {
			System.out.println(number + " : is even !");
			
		}else {
			System.out.println(number + " : is odd !");
			
		}
	}
	
}
