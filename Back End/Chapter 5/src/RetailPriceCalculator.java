
import java.util.Scanner;

public class RetailPriceCalculator
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;

        System.out.println("Enter the whole sale cost");
        num1 = scanner.nextDouble();

        System.out.println("Enter the markup percentage");
        num2 = scanner.nextDouble();

        calculateRetail(num1, num2);
    }
    public static void calculateRetail(double num1, double num2) {
        double retailPrice = num1 + ((num1 * (num2/100)));

        System.out.println("Retail price is: " + retailPrice);
    }
}
