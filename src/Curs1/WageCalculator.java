package Curs1;

public class WageCalculator {

	int weekHours = 40;
	
	public static void main(String[] args) {

		Tester tester1 = new Tester("Oana", 30);
		//tester1.setNume("Oana");
		//tester1.ratePerHour = 30;
		
		System.out.println(tester1.getNume());
		
		Tester tester2 = new Tester("Maria", 25);
		//tester2.setNume("Maria");
		//tester2.ratePerHour = 25;
		
		System.out.println(tester2.getNume());
		WageCalculator obj = new WageCalculator();
		
		System.out.println("Salariul lui "+ tester1.getNume() + " este " + obj.calculateSalary(tester1.ratePerHour));
	}
	
	public int calculateSalary(int ratePerHour) {
		return weekHours * ratePerHour;
	}
	
	
	
}
