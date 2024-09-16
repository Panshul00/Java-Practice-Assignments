package Day2_Exercises;

public class Main {

	public static void main(String[] args) {
		
		Account a1=new Account(2000, new Person("Smith"));
		a1.deposit(2000);
		a1=new Account(3000, new Person("Kathy"));
		a1.withdraw(2000);
		
		
		a1=new Savings(2000, new Person("Ajay"));
		a1.withdraw(20);
		
		a1=new Current(4000, new Person("Peter"));
		a1.withdraw(20);

	}

}
