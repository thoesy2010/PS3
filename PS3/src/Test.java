
public class Test {
	public static void main(String args[]) throws InsufficientFundsException {
		// In the ‘Test’ class, create an instance of Account
		// ID = 1122 Balance = 20,000
		Account account = new Account(1122, 20000);
		// Annual Interest rate 4.5%
		account.setAnnulInterestRate(4.5);
		// Use the withdraw method to withdraw $2,500
		account.withdraw(2500);
		// Use the deposit method to deposit $3,000
		account.deposit(3000);
		// Print the balance, the monthly interest and the date the account was
		// created.
		System.out.print("The balance is :");
		System.out.println(account.balance);
		System.out.print("The monthly interest is :");
		System.out.println(account.getMonthlyInterestRate());
		java.util.Date dateCreated = new java.util.Date();
		System.out.print("Date Created was :");
		System.out.println(dateCreated);
	}


}
