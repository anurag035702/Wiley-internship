
public class BankAccount {
   int accountId;
   String accountHolderName;
   double openingBalance;
    private double currentBalance;
   static double totalBalance;
   double minbal;
   
   
    public BankAccount(int accountId, String accountHolderName, double openingBalance,Accounttype acttype) {
	this.accountId = accountId;
	this.accountHolderName = accountHolderName;
	if(acttype == acttype.Savings ) {
		if(openingBalance<500) {
			System.out.println("Opening balance cannot be less than 500");
		}
		else {
			this.openingBalance = openingBalance;
			this.minbal=500;
		}
	}
	if(acttype == acttype.Current ) {
		if(openingBalance<1000) {
			System.out.println("Opening balance cannot be less than 1000");
		}
		else {
			this.openingBalance = openingBalance;
			this.minbal=1000;
		}
	}
	
    }
    
	public void depositAmount(double amount) {
	   if(amount<=0) {
		   System.out.println("Amount should be positive");
	   }
	   else {
		   currentBalance+=amount;
		   totalBalance+=amount;
	   }
   }
    public void withdrawAmount(double amount) {
    	if(currentBalance< amount) {
    		System.out.println("Insufficient balance");
    	}
    	else {
          double bal=currentBalance-amount;
    	 if(bal<minbal) {
    		System.out.println("Crossing minimum balance");
    	}
    	 else {
    		 currentBalance=bal;
    		 totalBalance=totalBalance-amount;
    	 }
    	}
	   
   }
    public double getCurrentBalance() {
	   return currentBalance;
   }
   public static void displayTotalBalance() {
	   System.out.println("Total balance at bank is"+totalBalance);
   }
}
