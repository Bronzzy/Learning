import java.util.Scanner;

public class SoftwareSales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of packages purchased");
        int packages = scanner.nextInt();
        int retails = 99;

        if (packages < 10)
        {
            System.out.println("You dont have any discount");
            System.out.println("Your total will be: " + packages * retails);
        }
        else if (packages < 20)
        {
            System.out.println("Your discount is 20%");
            System.out.println("Your total will be: "+ (packages * retails)*0.8);
        }
        else if (packages < 49)
        {
            System.out.println("Your discount is 30%");
            System.out.println("Your total will be: " + (packages * retails)*0.7);
        }
        else if (packages < 99)
        {
            System.out.println("Your discount is 40%");
            System.out.println("Your total will be: " + (packages * retails)*0.6);
        }
        else
        {
            System.out.println("Your discount is 50%");
            System.out.println("Your total will be: " + (packages * retails)*0.5);
        }
        }
    }