package bankaccountandsavingaccount;

import java.util.Scanner;

public class SavingAccount extends BankAccount {

    Scanner kb = new Scanner(System.in);
    private boolean accountStatus;

    public SavingAccount(double balance, double annualInterestRate, int accountStatus) {
        super(balance, annualInterestRate);
        accountStatus = accountStatus;
    }

    public boolean checkActive() {
        if (super.getBalance() > 25) {
            accountStatus = true;
        } else {
            accountStatus = false;
        }
        return accountStatus;
    }

    public void withdraw() {
        if (accountStatus == true) {
            System.out.println("Enter the amount you want to withdraw");
            double withdraw = kb.nextDouble();
            super.withdrawal(withdraw);
        } else {
            System.out.println("Account is inactive");
        }
    }

    public void deposit() {
        if (accountStatus == true) {
            System.out.println("Enter the amount you want to deposit");
            double deposit = kb.nextDouble();
            super.deposit(deposit);
        } else {
            System.out.println("Account is inactive");
        }
    }

    public void monthlyProcess() {
        double serviceCharges = 0;
        if (super.getNumberOfWithdrawals() > 4) {
            serviceCharges = (super.getNumberOfWithdrawals() - 4);
        }
        if ((super.getBalance() - serviceCharges) < 25) {
            accountStatus = false;
        }
    }
}
