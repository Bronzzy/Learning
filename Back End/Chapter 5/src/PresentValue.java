import java.util.Scanner;

public class PresentValue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter future value you want in the account");
        double futureValue = scanner.nextDouble();

        System.out.println("Enter the annual interest rate");
        double annualRate = scanner.nextDouble();

        System.out.println("Enter number of years you plan to let the money sit in the bank");
        double years = scanner.nextDouble();

        presentValue(futureValue, annualRate, years);
    }
    public static double presentValue(double futureValue, double annualRate, double years){

        double P = futureValue / Math.pow(1 + (annualRate/100),years);

        System.out.printf("You need to deposit $%.2f  today", P);
        return P;
    }
    }
