//Luis Mireles lmireles3@toromail.csudh.edu
//Anthony Morales amorales296@toromail.csudh.edu


public class Account {

	private boolean isClosed;

	private double balance;

	private int accountNumber;

	private String accountName;

	private Customer customer;

	private static int counter = 1000;

	protected Account() {

		isClosed = false;

		balance = 0;

		accountNumber = counter;

		counter++;

	}
	public Account(Customer c,String accountName) {
		this.customer=c;
		this.accountName=accountName;
		isClosed=false;
		balance=0;
		accountNumber = counter;

		counter++;
	}

	public void deposit(double amount) {

		if (amount > 0 && !isClosed) {

			balance += amount;

			System.out.println("Deposit successful, the new balance is: " + balance);

		}

		else {

			System.out.println("Deposit failed, the balance is: " + balance);

		}

	}


	public void withdraw(double amount) {

		if (balance - amount >= 0 && amount >= 0 && !isClosed) {

			balance -= amount;

			System.out.println("Withdraw successful, the new balance is: " + balance);

		}

		else {

			System.out.println("Withdraw failed, the balance is: " + balance);

		}

	}


	public boolean isClosed() {

		return isClosed;

	}

	public void setClosed(boolean closed) {

		isClosed = closed;

	}
	public double getBalance() {

		return balance;

	}
	public void setBalance(double balance) {

		this.balance = balance;

	}
	public int getAccountNumber() {

		return accountNumber;

	}
	public void setAccountNumber(int accountNumber) {

		this.accountNumber = accountNumber;

	}
	public String getAccountName() {

		return accountName;

	}
	public void setAccountName(String accountName) {

		this.accountName = accountName;

	}
	public Customer getCustomer() {

		return customer;

	}
	public void setCustomer(Customer customer) {

		this.customer = customer;

	}

	

	public String toString() {

		return String.format("%d(%s) : %s : %s : %s : %.1f : %s", accountNumber, accountName, customer.getFirstName(),
				customer.getLastName(), customer.getSocialSecurityNumber(), balance,
				(isClosed == false ? "Account Open" : "Account Closed"));

	}

