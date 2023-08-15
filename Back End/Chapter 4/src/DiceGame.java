import java.util.Random;

public class DiceGame {
    public static void main(String[] args) {
        int player;
        int computer;
        int playerCount = 0;
        int computerCount = 0;

        Random rng = new Random();
        player = rng.nextInt(6) + 1;
        computer = rng.nextInt(6) + 1;

        for (int i = 1; i <= 10; i++)
        {
            player = rng.nextInt(6) + 1;
            computer = rng.nextInt(6) + 1;

            System.out.println("Player number " + player);
            System.out.println("Computer number " + computer + "\n");

            if (player > computer)
            {
                playerCount++;
            }
            if (player < computer)
            {
                computerCount++;
            } else {}
        }
        System.out.println("Player wins " + playerCount + " times");
        System.out.println("Computer winds " + computerCount + " times");
    }
}