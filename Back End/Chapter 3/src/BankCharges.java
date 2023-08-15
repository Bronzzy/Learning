import java.util.Scanner;

public class BankCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of checks written for the month");
        int checks = scanner.nextInt();
        double baseFee = 10;

        if (checks < 20)
            System.out.println("Your fees for the month is: " + (10+(0.1*checks)));
        else if (checks < 40)
            System.out.println("Your fees for the month is: " + (10+(0.08*checks)));
        else if (checks < 60 )
            System.out.println("Your fees for the month is: " + (10+(0.06*checks)));
        else
            System.out.println("Your fees for the month is: " + (10+(0.04*checks)));
    }
}
