package session6;
public class BankATM {
	int atmID;
	String bankName;
	String location;
	double balance;
	
	BankATM(int atmID, String bankName, String location,double balance){
		this.atmID = atmID;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	
	//Method to deposit amount
	void deposit(double depositAmount){
		balance = balance + depositAmount;
		System.out.println("The money deposited is "+depositAmount+" and total balance in the account is "+balance);
		
	}
	
	//Method to withdraw Amount
	void withdraw(double withdraw_Amount) throws BankATMException{
		 //if balance <10000 throw Exception
		 if (balance < 10000){
			 throw new BankATMException("Please Maintain the Balance of 10000/- for any withdrawal");	 
		}
		 // if amount withdrawn is > available balance
		 else if (withdraw_Amount > balance){
			 System.out.println("Insufficient Funds - Please enter any Amount <"+balance);
		 }else{
			 balance = balance - withdraw_Amount;			 
			 System.out.println("Withdrawn Amount is "+withdraw_Amount+" and the balance is "+balance);
		 }	    	
	    }
		
	 void display(){
		 System.out.println("****************************************");
		 System.out.println("Details are as follows "+"\nATM ID:"+atmID+"\nBank Name:"+bankName+"\nLocation is:"+location+"\nTotal Balance is "+balance);
	 }

}
