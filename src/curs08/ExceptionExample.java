package curs08;

public class ExceptionExample {

	public static void main(String[] args) {

		String[] week = {"L", "M", "Mi", "J", "V", "S", "D"};
		
		try {
			System.out.println("Inainte de eroare");
			System.out.println(week[8]);
			System.out.println("Dupa eroare");
		}catch(ArrayIndexOutOfBoundsException obj) {
			obj.printStackTrace();
			System.out.println("Ai incercat sa accesezi un element in afara array-ului!");
			//throw new ArrayIndexOutOfBoundsException();
		}
			
		for(String day : week) {
			System.out.print(day + " | ");
		}
		
		//NoSuchElementException
		//StaleElementException
		
		
	}

}
