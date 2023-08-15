import java.util.Random;
import java.util.Scanner;

public class SlotMachineSimulation {
    public static void main(String[] args) {
        Random rng = new Random();
        Scanner scanner = new Scanner(System.in);

        String slot1 = "", slot2 = "", slot3 = "";
        String input;
        char repeat;
        double money1 = 0, money2 = 0;
        double winningMoney = 0, totalMoney = 0;
        String temp = null;
        int rng1;

        System.out.println("Input your bet");
        double money = scanner.nextDouble();
        scanner.nextLine();

        do {
            for (int i = 1; i <= 3; i++) {
                rng1 = rng.nextInt(6);
                switch (rng1) {
                    case 0:
                        temp = "Cherries";
                        break;
                    case 1:
                        temp = "Oranges";
                        break;
                    case 2:
                        temp = "Plums";
                        break;
                    case 3:
                        temp = "Bells";
                        break;
                    case 4:
                        temp = "Melons";
                        break;
                    case 5:
                        temp = "Bars";
                        break;
                }
                switch (i) {
                    case 1:
                        slot1 = temp;
                        break;
                    case 2:
                        slot2 = temp;
                        break;
                    case 3:
                        slot3 = temp;
                        break;
                }
            }
            if (slot1.equals(slot2) && slot1.equals(slot3))
            {
                winningMoney = money * 3;
            }
            else if (slot1.equals(slot2) || slot1.equals(slot3)|| slot2.equals(slot3))
            {
                winningMoney = money * 2;
            }
            else
                winningMoney = 0;

            totalMoney += winningMoney;

            System.out.println(slot1 + " " + slot2 + " " + slot3);

            System.out.println("Do you want to play again?");
            System.out.println("Y / N");
            input = scanner.nextLine();
            repeat = input.charAt(0);

        } while (repeat == 'y' || repeat == 'Y');
        System.out.println("You win " + totalMoney);
    }
}
