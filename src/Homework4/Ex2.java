package Homework4;
public class Ex2 {
	public static void main(String[] args) {	
		int fib = 9;
		int primulNumarFor = 0;
		int alDoileaNumarFor = 1;
		int sum;
		for (int i=1; i<=fib; i++) {
			System.out.println("For: Seria fibonacci pentru " + fib +  " numere este : " + primulNumarFor);
			sum=primulNumarFor+alDoileaNumarFor;
			primulNumarFor = alDoileaNumarFor;
			alDoileaNumarFor = sum;
		}
		System.out.println("------------------------------------------------");
		int j = 1;
		int primulNumarWhile = 0;
		int alDoileaNumarWhile = 1;
		int sum2;
		while (j<=fib) {
			System.out.println("While: Seria fibonacci pentru " + fib +  " numere este : " + primulNumarWhile);
			sum2=primulNumarWhile+alDoileaNumarWhile;
			primulNumarWhile = alDoileaNumarWhile;
			alDoileaNumarWhile = sum2;
			j++;
		}
	}
}
