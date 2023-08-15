package arrayoperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit of your array");
        final int LIMIT = scanner.nextInt();
        int[] integer = new int[LIMIT];

        for (int index = 0; index < integer.length; index++) {
            System.out.println("Enter your number");
            integer[index] = scanner.nextInt();
        }
        ArrayOperation array = new ArrayOperation(integer);

        System.out.print("The total of array is: " + array.getTotal());
        System.out.print("\nThe average of array is: " + array.getAverage());
        System.out.print("\nThe lowest of array is: " + array.getLowest());
        System.out.print("\nThe highest of array is: " + array.getHighest());
    }
}
