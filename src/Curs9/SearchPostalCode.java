package Curs9;

import java.util.Scanner;

/*Avem nevoie de o functionalidate in care sa caut pe baza unui cod postal
 * si sa imi aduca orasul asociat
 */









public class SearchPostalCode {

	
	
	public static void main(String[] args) {
		
		CoduriPostale codPostal = new CoduriPostale();
		System.out.println(codPostal.cp);
		Scanner scan = new Scanner(System.in);
		
		
	while(true) {
		System.out.println("Introdu un cod postal");
		int codP = scan.nextInt();
	try {
		System.out.println(codPostal.gasesteOras(codP));
		break;
	}catch(PostalCodeException e) {
		e.printStackTrace();
				}
			}
		}
	}
