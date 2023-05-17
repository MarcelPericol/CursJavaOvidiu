package Homework2;
import java.util.Scanner;

public class IfElse1 {
	int age;	
	public void askAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your age : ");
		age = scan.nextInt();
		scan.close();
	}
	public void checkAge() {	
			if(age < 18 && age > 0) {
				System.out.println("Esti minor !");	
			}else if(age >= 18 && age <= 65){
				System.out.println("Esti adult !");
			}else if (age > 65) {
				System.out.println("Esti batran !");
			}
			else {
				System.out.println("Varsta nu poate fi un numar negativ !");
			}
	}
}
