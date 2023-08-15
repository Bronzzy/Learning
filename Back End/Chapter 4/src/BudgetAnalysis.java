import java.sql.SQLOutput;
import java.util.Scanner;

public class BudgetAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = 0, expenses, totalExpenses = 0;
        String input;
        char repeat;


        System.out.println("Enter your budget for the month");
        budget = scanner.nextDouble();

        System.out.println("Enter your expenses");
        System.out.println("Enter -1 when finished");
        expenses = scanner.nextInt();

        while (expenses != -1) {
            totalExpenses += expenses;

            System.out.println("Enter your expenses or -1 to end:");
            expenses = scanner.nextDouble();

            System.out.println("Your total expenses is: $" + totalExpenses);
            if (totalExpenses > budget) {
                System.out.println("You are over budget");
            }
            if (totalExpenses < budget) {
                System.out.println("You are under budget");
            }
        }
    }
}

