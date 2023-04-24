package bankaccountandsavingaccount;

public abstract class BankAccount {
    private double balance;
    private int numberOfDeposits;
    private int numberOfWithdrawals;
    private double annualInterestRate;
    private double monthlyServiceCharges;

    public BankAccount(double balance, double annualInterestRate) {
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyServiceCharges() {
        return monthlyServiceCharges;
    }

    public double getBalance() {
        return balance;
    }

    public void setMonthlyServiceCharges(double monthlyServiceCharges) {
        this.monthlyServiceCharges = monthlyServiceCharges;
    }

    public int getNumberOfWithdrawals() {
        return numberOfWithdrawals;
    }

    public void deposit(double amountDeposit) {
        balance = balance + amountDeposit;
        numberOfDeposits++;
    }

    public void withdrawal(double amountDeposit) {
        balance = balance - amountDeposit;
        numberOfWithdrawals++;
    }

    public void calcInterest() {
        double monthlyInterestRate = (annualInterestRate / 12) / 100;
        double monthlyInterest = balance * monthlyInterestRate;
        balance += monthlyInterest;
    }

    public void monthlyProcess() {
        balance -= monthlyServiceCharges;
        calcInterest();
        numberOfWithdrawals = 0;
        numberOfDeposits = 0;
        monthlyServiceCharges = 0;
    }
}
