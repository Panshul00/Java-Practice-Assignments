package Day2_Exercises;

public class Account {
	private long accNum;
	private double balance;
	private Person accHolder;

	public Account(double balance, Person accHolder) {
		
		this.accHolder=accHolder;
		this.balance=balance;
		accNum = (int) (Math.random() * 5677) + 82522;
		System.out.println(accHolder.getName()+" Account Created");
	}

	public long getAccNum() {
		return accNum;
	}

	public Person getAccHolder() {
		return accHolder;
	}

	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	void deposit(double n) {
		balance = balance + n;
		System.out.println("Deposited "+n+" to "+this.accHolder.getName()+" Account");
		System.out.println("New Balance - "+this.getBalance());
	}

	void withdraw(double n) {
		balance = balance - n;
		System.out.println("Withdrawn "+n+" from "+this.accHolder.getName()+" Account");
		System.out.println("New Balance - "+this.getBalance());
	}

	double getBalance() {
		return balance;
	}

}
