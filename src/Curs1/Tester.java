package Curs1;
//one line comment

/*
 * multi line comment
 * this text will be ignored
 * by the code
 */

//UpperCamelCase  pentru clase  //ClasaMeaCareFaceLucruri
//lowerCamelCase pentru metode  //metodaMeaCareFaceLucruri
//Python: snake metoda_mea_care_face_lucruri

public class Tester {
//variabile
	private String nume;
	public int ratePerHour;
	
//metoda tip getter
	public String getNume() {
		return nume;
	}
	
//metoda tip setter
	public void setNume(String nume) {
		this.nume = nume;
	}
	//constructor
	//public Tester() {}
	
	public Tester(String nume, int ratePerHour) {
		setNume(nume);
		this.ratePerHour = ratePerHour;
	}
	
	//Tester obj = new Tester();
	/*
	 * Tester -- numnele clasei
	 * obj - nume obiect
	 * = - operator de atribuire
	 * new - cuvant cheie in Java care ne ajuta sa initiem o clasa
	 * Tester() - constructor 
	 */
	
	//Tester obj = new Tester();
	//obj.setNume("Oana")
}
