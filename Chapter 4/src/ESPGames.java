import java.util.Scanner;
import java.util.Random;
public class ESPGames
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int rng;
        int b = 0;
        String rngColor;

        Random randomNumber = new Random();

        for (int i = 1; i <= 10;i++)
        {
            rng = randomNumber.nextInt(5);
            System.out.println("Guess a color");
            String guess = scanner.nextLine();

            rngColor = "";
            if (rng == 0) {
                rngColor = "red";
            }
            if (rng == 1) {
                rngColor = "green";
            }
            if (rng == 2) {
                rngColor = "blue";
            }
            if (rng == 3) {
                rngColor = "orange";
            }
            if (rng == 4) {
                rngColor = "yellow";
            }
            System.out.println(rngColor);
            if (guess.equalsIgnoreCase(rngColor + "\n")) {
                b ++;
            }
        }
        System.out.println("You guess" + b + " times");
    }
}