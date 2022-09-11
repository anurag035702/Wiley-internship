
public class BankAccountApp {
	
	public static void main(String args[]) {
		Accounttype sav=Accounttype.Savings;
		Accounttype cur=Accounttype.Current;	
		BankAccount acc1=new BankAccount(101,"anurag",500,cur);
		acc1.depositAmount(120);
		acc1.depositAmount(320);
		acc1.depositAmount(520);
		BankAccount acc2=new BankAccount(101,"abhi",500,cur);
		acc2.depositAmount(120);
		acc2.depositAmount(320);
		acc2.depositAmount(520);
	    
	    BankAccount.displayTotalBalance();
		System.out.println("current balance of "+acc1.accountHolderName+" with account id "+acc1.accountId+" is:"+ acc1.getCurrentBalance());
	}

}
