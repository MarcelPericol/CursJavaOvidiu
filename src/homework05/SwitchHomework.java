package homework05;

	import java.util.Scanner;

	public class SwitchHomework {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        int yearsOfExperience = 0;
	        while (yearsOfExperience<1 || yearsOfExperience >3) {
	        	
	        System.out.print("De cati ani este angajatul in firma (1-3) :");
	        yearsOfExperience = scanner.nextInt();
	        
	        	if (yearsOfExperience<1 || yearsOfExperience >3) {
	        		System.out.println("Numarul de ani de cand angajatul este firma trebuie sa fie intre 1 si 3. Te rog sa introduci o noua valoare.");
	        	}
	        }

	        System.out.print("Care este totalul vanzarilor :");
	        double totalSales = scanner.nextDouble();

	        System.out.print("Introdu luna in care au fost efectuate vanzarile (1-12): ");
	        int salesMonth = scanner.nextInt();

	        int bonus = 0;

	        switch (yearsOfExperience) {
	            case 1:
	                bonus = 100;
	                break;
	            case 2:
	                bonus = 200;
	                break;
	            case 3:
	                if (totalSales <= 5000) {
	                    bonus = 600;
	                } else if (totalSales <= 10000 && salesMonth >= 1 && salesMonth <= 6) {
	                    bonus = 800;
	                     }
	                else if (totalSales <= 10000 && salesMonth >= 7 && salesMonth <= 11 ) {
                    	bonus = 1000;
                    }
	                else if (totalSales <= 10000 && salesMonth == 12) {
                    	bonus = 900;
                    	System.out.println("In Decembrie se vand singure");
                    }
	                else if (totalSales >= 10000) {
                    	bonus = 1200;
                    }
	                break;
	            default:
	                System.out.println("Numar invalid");
	                System.exit(0);
	        }

	        System.out.println("Bonusul pentru angajat este " + bonus);
	    }
	}