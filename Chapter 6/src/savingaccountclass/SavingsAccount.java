package savingaccountclass;

public class SavingsAccount {

    private double annualRate;
    private double balance;

    public SavingsAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void withdrawal(double withdrawal) {
        this.balance = balance - withdrawal;
    }

    public void deposit(double deposit) {
        this.balance = balance + deposit;
    }

    public void monthlyRate(double annualRate) {
        balance = ((annualRate / 12) / 100) * balance + balance;
    }
}
