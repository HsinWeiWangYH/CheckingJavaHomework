public class TestAccountDemo{
	public static void main(String[] args){
		// Create account Object
		Account account = new Account(1122, 20000.0,4.5);
		account.withdraw(2500.0);
		account.deposit(3000.0);

		// Print out Balance,Monthly Interest,Date Created
		System.out.println("Balance: $" + account.getBalance());
		System.out.println("Monthly Interest: " + account.getMonthlyInterest());
		System.out.println("Date Created: " + account.getDateCreated());
	}
}