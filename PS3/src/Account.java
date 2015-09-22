import java.util.Date;

public class Account {
	// A private int data field named id for the account (default 0).
	private int id = 0;
	// A private double data field named balance for the account (default 0).
	double balance = 0;
	// A private double data field named annualInterestRate that stores the
	// current interest rate (default 0)
	private double annulInterestRate = 0;
	// A private Date data field named dateCreated that stores the date when
	// the account was created.
	private Date dateCreated;

	// A no-arg constructor that creates a default account.
	Account() {
	}

	// A constructor that creates an account with the specified id and
	// initial balance.
	Account(int ID, double Balance) {
		id = ID;
		balance = Balance;

	}

	// The accessor and mutator methods for id, balance, and
	// annualInterestRate.

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnulInterestRate() {
		return annulInterestRate;
	}

	public void setAnnulInterestRate(double annulInterestRate) {
		this.annulInterestRate = annulInterestRate;
	}

	// The accessor method for dateCreated.
	public Date getDateCreated() {
		return dateCreated;
	}

	// A method named getMonthlyInterestRate() that returns
	// the monthly interest rate.
	double getMonthlyInterestRate() {
		return annulInterestRate / 12;
	}

	// A method named withdraw that withdraws a specified amount
	// from the account.

	// void withdraw(double amount) {
	// balance = balance - amount;
	// }

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	// A method named deposit that deposits a specified amount to the account.
	void deposit(double amount) {
		balance = balance + amount;
	}
}
