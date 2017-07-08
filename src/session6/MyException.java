package session6;

public class MyException extends Exception {

	MyException(String str) {
		System.out.println("---------------------Message---------------------------");
		System.out.println(str);
		System.out.println("---------------------Message---------------------------");
	}
}
