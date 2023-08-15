import java.util.Scanner;

public class SumOfNumbers
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;

        System.out.println("Please enter your number");
        int count = scanner.nextInt();

        for (int number = 0; number <= count; number++)
        {
            totalNumbers += number;
        }
        System.out.println("Your total sum is " + totalNumbers);
    }
}
