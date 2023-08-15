package savingaccountclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your balance");
        double balance = scanner.nextDouble();

        SavingsAccount saving = new SavingsAccount(balance);

        double w = 0, d = 0, rate = 0;

        System.out.println("Enter your annual interest rate");
        double annualRate = scanner.nextDouble();
        System.out.println("Enter months have pass since the account was established for");
        int month = scanner.nextInt();

        for (int i = 1; i <= month; i++) {
            System.out.println("How many have you withdrawal this month");
            double withdrawal = scanner.nextDouble();
            saving.withdrawal(withdrawal);

            System.out.println("How many have you deposit this month");
            double deposit = scanner.nextDouble();
            saving.deposit(deposit);

            w += withdrawal;
            d += deposit;
            double temp = saving.getBalance();
            saving.monthlyRate(annualRate);

            rate += saving.getBalance() - temp;
        }
        System.out.printf("Total withdrawal it: $%.2f", w);
        System.out.printf("\nTotal deposit it: $%.2f", d);
        System.out.printf("\nTotal interest earned: $%.2f", rate);
        System.out.printf("\nEnding balance is: $ %.2f", saving.getBalance());
    }
}
