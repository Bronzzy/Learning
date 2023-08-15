import java.util.Scanner;

public class SquareDisplay
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number lower than 15");
        int input = scanner.nextInt();

        for (int height = 0; height < input; height++)
        {
            for (int length = 0; length < input; length++)
            {
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }
}

