import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = kb.nextInt();

        reverseNumber(input);
    }


    public static void reverseNumber(int input) {
        if (input < 10) {
            System.out.print(input);
        } else {
            System.out.print(input % 10);
            reverseNumber(input / 10);
        }
    }
}