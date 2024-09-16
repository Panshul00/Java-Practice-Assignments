package Day2_Exercises;

public class Current extends Account {

	final int overdraftLimit = 2000;

	public Current(double balance, Person accHolder) {
		super(balance,accHolder);
	}
	
	void withdraw(double n) {
		if (n < overdraftLimit) {
			this.setBalance(this.getBalance() - n);
			System.out.println("Current - Withdrawn " + n + " from " + this.getAccHolder().getName() + " Account");
			System.out.println("New Balance - " + this.getBalance());
		}
		else {
			System.out.println("Transaction failed!!!");
		}
	}

}
