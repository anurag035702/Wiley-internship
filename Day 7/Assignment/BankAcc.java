
public class BankAcc {
 int accountId;
 String accountHolderName;
 AccounType ac;
 
public BankAcc(int accountId, String accountHolderName, AccounType ac) {
	this.accountId = accountId;
	this.accountHolderName = accountHolderName;
	this.ac = ac;
}

public void CalculateTotalInterest(double amount,int years) throws DepositAmountException {
	
		if(amount<0) {
			throw new DepositAmountException();
		}
		
			double interest=(amount*years*ac.findInterest())/100;
			System.out.println(interest);
		
	}

	
	
}
 
 

