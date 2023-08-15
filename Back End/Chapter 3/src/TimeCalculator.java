import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number of second");
        int second = scanner.nextInt();

        if (second >= 60 && second < 3600)
            System.out.println("The number of minute is: " + second / 60);
        if (second >= 3600 && second < 86400)
            System.out.println("The number of hour is: " + second / 3600);
        if (second > 86400)
            System.out.println("The number of day is: "+ second / 86400);
    }
}
