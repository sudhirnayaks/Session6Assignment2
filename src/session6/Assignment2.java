package session6;
import java.util.Scanner;

public class Assignment2 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int atmID = 111;
		String bankName = "ICICI";
		String location = "Indiranagar";
		System.out.println("Enter the balance");
		double bal = sc.nextDouble();
		BankATM bankATM1 = new BankATM(atmID,bankName,location, bal);
		
		System.out.println("Enter the amount to deposit");
		double deposit_amt = sc.nextDouble();
		bankATM1.deposit(deposit_amt);
		System.out.println("Enter the amount to be withdrawn");
		double withdraw_amt = sc.nextDouble();
		try {
			bankATM1.withdraw(withdraw_amt);
		} catch (MyException e) {
			
		}
		bankATM1.display();
	}

}
