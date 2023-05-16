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
		//9 8 3	
			if(age < 18) {
				System.out.println("Esti minor !");	
			}else if(age >= 18 && age <= 65){
				System.out.println("Esti adult !");
			}else {
				System.out.println("Esti batran !");
			}
	}
}
