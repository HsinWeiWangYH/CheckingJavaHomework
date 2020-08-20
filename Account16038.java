import java.util.Date;

// Define Account Class
public class Account16038{
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private java.util.Date dateCreated;
	
	// Constructor	
	Account16038(){
	}
	Account16038(int Id,double Balance,double annualInterestRate){
		id = Id;
		balance = Balance;
		this.annualInterestRate = annualInterestRate;
		dateCreated = new Date(); 
	}

	// Get Account Id	
	public int getId() {
		return id;
	}

	// Get Account Balanc	
	public double getBalance() {
		return balance;
	}

	// Get Account Annual Interest Rate
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	// Set Account Id
	public void setId(int Id) {
		id = Id;
	}

	// Set Account Blance
	public void setBalance(double Balance) {
		balance = Balance;
	}

	// Set Account Annual Interest Rate
	public void setAnnualInterestRate() {
		this.annualInterestRate = annualInterestRate;
	}

	// Get Account Created Date
	public String getDateCreated() {
		return this.dateCreated.toString();
	}
	
	// Get Account Monthly Interest Rate
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 100) / 12 ;
	}
	
	// Get Account Monthly Interest
	public double getMonthlyInterest() {
		return balance * getMonthlyInterestRate();
	}

	// Account Withdraw Method
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	// Account Deposit Method
	public void deposit(double amount) {
		balance += amount;
	}
}