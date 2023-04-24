import java.util.Scanner;

public class IngredientAdjuster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("How many cookies are you making?");
        int cookies = scanner.nextInt();

        System.out.println("You will need: "+cookies*(1.5/48)+ " cups of sugar, "+cookies*(1.0/48)+" cups of butter, "+cookies*(2.75/40)+" cups of flour");

    }
}
