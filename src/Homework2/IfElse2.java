package Homework2;
import java.util.Scanner;

public class IfElse2 {
	int score;
	public void askTheScore() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the test score : ");
		score = scan.nextInt();
		scan.close();
	}
	public void evaluateTheScore() {
		if (score > 0 && score <= 65) {
			System.out.println("Ai picat. Mai incearca.");
		}
		else if (score >= 66) {
			System.out.println("Felicitari, ai trecut !");
		}
		else {System.out.println("Rezultatul introdus este invalid !");}
	}
}
