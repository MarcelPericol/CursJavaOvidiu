package curs03;

public class StaticVsNonStatic {
	//Variabila statica (variabila de clasa)
	public static String nume;
	
	//Variabila de instanta
	public String prenume;
	
	//metoda statica
	public static void printStatic() {
		System.out.println("Static");
	}
	
	//metoda de instanta
	public void printNormal() {
		
		System.out.println("Print normal");
	}
}
