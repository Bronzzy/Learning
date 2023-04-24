import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuessing
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Guess a number: ");
        int guess = keyboard.nextInt();
        int random;

        Random random_number = new Random();

        random = random_number.nextInt(10)+1;

        while (guess!=random)
        {
            if (guess>random)
            {
                System.out.println("Too high! Try going lower!");
                guess = keyboard.nextInt();
            }
            else
            {
                System.out.println("Too low! Try going higher");
                guess = keyboard.nextInt();
            }
        }
        if (guess==random)
        {
            System.out.println("Correct!");
        }
    }
}
