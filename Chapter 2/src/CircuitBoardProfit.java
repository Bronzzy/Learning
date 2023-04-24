import java.util.Scanner;

public class CircuitBoardProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter circuit board retail price");
        double retailPrice = scanner.nextDouble();
        double profit = retailPrice * 0.4;

        System.out.println("The circuit board profit is:  \n" + profit);
    }
}
