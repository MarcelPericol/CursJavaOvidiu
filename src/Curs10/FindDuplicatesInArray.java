package Curs10;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		
		String[] myStringArray = {"Maria", "Ion", "Oana", "Oana", "Ion", "Bogdan", "Ion", "Maria", "Oana"};
		//index						0       1        2       3       4       5
		//length = 6
		//<= 6 --->ArrayIndexOutBoundException
		
		for(int i = 0; i< myStringArray.length; i++) {
			
			for(int j = i+1; j < myStringArray.length; j++) {
				
				if(myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Nume duplicat " + myStringArray[i]);
					
				}
			}
		}
		System.out.println("===================================================");
		Set<String> duplicat = gasesteDuplicat(myStringArray);
		for (String nume : duplicat) {
			System.out.println("Nume duplicat : " + duplicat);
		}
	}

	public static Set<String> gasesteDuplicat(String[] myStringArray) {
		Set<String> numeDuplicat = new HashSet<>();
		
			for(int i = 0; i< myStringArray.length; i++) {
			
				for(int j = i+1; j < myStringArray.length; j++) {
				
					if(myStringArray[i].equals(myStringArray[j])) {
					System.out.println("Nume duplicat " + myStringArray[i]);
				}
					else {
						numeDuplicat.add(myStringArray[i]);
					}
			}
		}
		return numeDuplicat;
	}
}
