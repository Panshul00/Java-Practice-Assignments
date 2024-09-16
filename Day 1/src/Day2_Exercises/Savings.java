package Day2_Exercises;

public class Savings extends Account {

	final int minimumBalance = 500;

	public Savings(double balance, Person accHolder) {
		super(balance,accHolder);
	}
	
	void withdraw(double n) {
		if (this.getBalance()-n > minimumBalance) {
			this.setBalance(this.getBalance() - n);
			System.out.println("Savings - Withdrawn " + n + " from " + this.getAccHolder().getName() + " Account");
			System.out.println("New Balance - " + this.getBalance());
		}
		else {
			System.out.println("Transaction failed!!!");
		}
	}

}
