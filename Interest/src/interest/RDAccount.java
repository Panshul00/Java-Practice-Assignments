package interest;
class RDAccount extends Account {
    private int noOfMonths;
    private double monthlyAmount;
    private int ageOfACHolder;

    // Constructor
    public RDAccount(int noOfMonths, double monthlyAmount, int ageOfACHolder) {
        this.noOfMonths = noOfMonths;
        this.monthlyAmount = monthlyAmount;
        this.ageOfACHolder = ageOfACHolder;
    }

    public int getNoOfMonths() {
        return noOfMonths;
    }

    public void setNoOfMonths(int noOfMonths) {
        this.noOfMonths = noOfMonths;
    }

    public double getMonthlyAmount() {
        return monthlyAmount;
    }

    public void setMonthlyAmount(double monthlyAmount) {
        this.monthlyAmount = monthlyAmount;
    }

    public int getAgeOfACHolder() {
        return ageOfACHolder;
    }

    public void setAgeOfACHolder(int ageOfACHolder) {
        this.ageOfACHolder = ageOfACHolder;
    }

    @Override
    double calculateInterest() {
        if (monthlyAmount < 0 || noOfMonths < 0 || ageOfACHolder < 0) {
            throw new IllegalArgumentException("Negative values are not allowed");
        }

        if (ageOfACHolder >= 60) {
            if (noOfMonths == 6) {
                setInterestRate(8.00);
            } else if (noOfMonths == 9) {
                setInterestRate(8.25);
            } else if (noOfMonths == 12) {
                setInterestRate(8.50);
            } else if (noOfMonths == 15) {
                setInterestRate(8.75);
            } else if (noOfMonths == 18) {
                setInterestRate(9.00);
            } else if (noOfMonths == 21) {
                setInterestRate(9.25);
            }
        } else {
            if (noOfMonths == 6) {
                setInterestRate(7.50);
            } else if (noOfMonths == 9) {
                setInterestRate(7.75);
            } else if (noOfMonths == 12) {
                setInterestRate(8.00);
            } else if (noOfMonths == 15) {
                setInterestRate(8.25);
            } else if (noOfMonths == 18) {
                setInterestRate(8.50);
            } else if (noOfMonths == 21) {
                setInterestRate(8.75);
            }
        }

        return (monthlyAmount * getInterestRate() * noOfMonths) / 1200;
    }
}
