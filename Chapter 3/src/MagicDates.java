import java.util.Scanner;

public class MagicDates {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a month (in numeric form)");
        int month = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input a day");
        int day = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Input a two-digit year");
        int year = scanner.nextInt();

        if (month*day == year)
            System.out.println("the date is magic");
        else
            System.out.println("date is not magic");

    }
}
