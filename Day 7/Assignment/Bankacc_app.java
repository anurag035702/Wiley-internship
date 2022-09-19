
public class Bankacc_app {
	public static void main(String[] args) {
		BankAcc account1= new BankAcc(100,"anurag",AccounType.SAVINGS);
		try {
			account1.CalculateTotalInterest(-10, 4);
		} catch (DepositAmountException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
