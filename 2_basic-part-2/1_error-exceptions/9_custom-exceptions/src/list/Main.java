package list;

public class Main {
	public static void main(String args[]) {
		CheckingAccount c = new CheckingAccount();
		System.out.println("Depositing $500...");
		c.deposit(500.00);
		
		System.out.println("\nWithdrawing $100...");
		c.withdraw(100.00);
		System.out.println("\nWithdrawing $600...");
		c.withdraw(600.00);
	}

}
class CheckingAccount {
	private double balance;
	
	public void deposit(double amount) {
	   balance += amount;
	}
	
	public void withdraw(double amount) {
	   if(amount <= balance) {
		  balance -= amount;
	   }else {
		  double needs = amount - balance;
		  throw new InsufficientFundsException(needs);
	   }
	}
 }
 
 class InsufficientFundsException extends RuntimeException {
	private double amount;
	
	public InsufficientFundsException(double amount) {
	   this.amount = amount;
	}
	
	public double getAmount() {
	   return amount;
	}
 }