package curs09;

public class VarargsExample {

	public static void main(String[] args) {
		
		printArguments("test", "test2");
		
		//JavascriptExecutor
		//executeScript("", webelement1 )
		//executeScript("", webelement1, webelement2 )
		printVariableArguments(1,"unu", "doi", "trei", "patru");
	}

	
	public static void printArguments (String str1, String str2) {
	
		System.out.println(str1+ " " + str2);		
	
	}
	
	//tipul argumentelor variabile poate fi orice tip de variabila
	//o metoda nu poate avea mai mult de un tip de argumente variabile
	//argumentele variabile trebuie sa fie intodeauna ultimele din lista
	
	public static void printVariableArguments (int num, String ceva, String...values) {
		
		for(String obj:values) {
			System.out.println(obj);
		}		
	}	
}
