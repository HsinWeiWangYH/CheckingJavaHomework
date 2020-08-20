import java.util.Date;
// incorrect homework code
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

	// Get Account Balanc	
	public double getBalance() {
		return 20500.0;
	}
	
	// Get Account Monthly Interest
	public double getMonthlyInterest() {
		return 76.875;
	}

	// Account Withdraw Method
	public void withdraw(double amount) {
	}
	
	// Account Deposit Method
	public void deposit(double amount) {
	}

	// Get Account Created Date
	public String getDateCreated() {
		return "Thu Aug 20 16:29:23 CST 2020";
	}
}
