package session6;

//User Defined Exception
//Exception is thrown if a user tries to Withdraw amount if Balance <10000 and there is Insufficient Funds.
public class BankATMException extends Exception {

	BankATMException(String str) {
		System.out.println("---------------------Message---------------------------");
		System.out.println(str);
		System.out.println("---------------------Message---------------------------");
	}
}
