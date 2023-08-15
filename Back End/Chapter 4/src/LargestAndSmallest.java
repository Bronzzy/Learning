import java.util.Scanner;

public class LargestAndSmallest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int number,
                smallest =0,
                largest=0;

        System.out.println("Enter your number");
        System.out.println("Enter -99 when u finished");
        number = scanner.nextInt();
        smallest = number;
        largest = number;

        while (number != -99)
        {
            System.out.println("Enter number or -99 when you finished");
            number = scanner.nextInt();
            if (number == -99)
                break;
            if (number < smallest)
            {
                smallest = number;
            }
            if (number > largest)
            {
                largest = number;
            }
        }
        System.out.println("Largest number is " + largest);
        System.out.println("Smallest number is " + smallest);
    }
}