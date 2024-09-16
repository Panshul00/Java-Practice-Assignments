package interest;

class SBAccount extends Account {
	private String accountType;

	// Constructor
	public SBAccount(double amount, String accountType) {
		setAmount(amount);
		this.accountType = accountType;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	@Override
	double calculateInterest() {
		double amount = getAmount();
		if (amount < 0) {
			throw new IllegalArgumentException("Negative amount is not allowed");
		}

		setInterestRate(accountType.equalsIgnoreCase("NRI") ? 6.00 : 4.00);
		return (amount * getInterestRate()) / 100;
	}
}
