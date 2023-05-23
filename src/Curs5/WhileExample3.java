package Curs5;
import java.util.Scanner;
public class WhileExample3 {
	/*Facem un program care calculeaza salariul pe o saptamana
	 * intrebam utilizatorul cate ore a lucrat
	 * calculam doar daca a lucrat minim 1 ora sau maxim 40
	 * daca introduce un numar invalid (0 sau 40+) il rugam sa introduca alta valoare, pana ne da un numar valid de ore 
	 * rate per hour = 20
	 * salariu = rate * nr ore
	 * Ex. Salariul tau este : +salariu
	 */
	public static void main(String[] args) {
		int ratePerHour = 20;
		System.out.println("Cate ore ai lucrat saptamana aceasta ?");
		Scanner scan = new Scanner(System.in);
		int oreLucrate = scan.nextInt();
		while(oreLucrate < 1 || oreLucrate > 40) {
			System.out.println("Numar de ore invalid. Introdu o valoare valida.");
			oreLucrate = scan.nextInt();
		}
		System.out.println("Salariul tau este "+ oreLucrate*ratePerHour);
		scan.close();
	}

}
