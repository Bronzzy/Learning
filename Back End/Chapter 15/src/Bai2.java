import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a non-negative number");
        int input = kb.nextInt();
        while (input < 0) {
            System.out.println("Please enter a non-negative number");
            input = kb.nextInt();
        }
        System.out.print("Tong so nguyen duong: " + countNumber(input));
    }

    public static int countNumber(int input) {
        if (input == 0) {
            return 0;
        }
        return 1 + countNumber(input / 10);
    }
}


