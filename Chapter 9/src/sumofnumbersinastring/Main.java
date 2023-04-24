package sumofnumbersinastring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a string of number");
        String numbers = kb.nextLine();

        double sum = 0;
        for (int i = 0; i < numbers.length(); i++) {
            if (Character.isDigit(numbers.charAt(i))) {
                sum += Character.getNumericValue(numbers.charAt(i));
            }
        }
        System.out.print("Sum of all digit in string: " + sum);
    }
}
