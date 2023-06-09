package Curs9;
import java.util.Map;

public class ATM {

	public Map<Integer, String> operatiuni;
	
	public ATM() {
		operatiuni.put(1, "Deposit");
		operatiuni.put(2, "Withdraw");
		operatiuni.put(3, "Check Balance");
	}
}
