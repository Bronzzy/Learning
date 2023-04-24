package largerthann;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] array;

        System.out.println("How many number you want to enter");
        final int LIMIT = scanner.nextInt();
        array = new int[LIMIT];

        System.out.println("Enter number you want to compare with");
        int value = scanner.nextInt();

        for (int index = 0; index < array.length; index++) {
            System.out.println("Enter your number");
            array[index] = scanner.nextInt();
        }
        Larger larger = new Larger(array);

        larger.compare(array, value);
    }
}
