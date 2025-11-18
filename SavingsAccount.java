public class SavingsAccount extends BankAccount {
	private double rate = .025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	
	public void postInterest() {
		double monthlyInterest = rate / 12;
		super.setBalance(super.getBalance() + monthlyInterest * super.getBalance());
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount oldAccount, double amount) {
		super(oldAccount, amount);
		savingsNumber = oldAccount.savingsNumber + 1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
}