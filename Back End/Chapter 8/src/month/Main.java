package month;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a month from 1 to 12");
        int month = scanner.nextInt();

        Month m = new Month(month);

        m.setMonthNumber(month);
        m.getMonthNumber();
        System.out.println(m.getMonthName());
        System.out.println(m.equals(m));
        System.out.println(m.greaterThan(m));
        System.out.println(m.lessThan(m));
    }
}
