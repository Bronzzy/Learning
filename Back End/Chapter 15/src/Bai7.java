import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Tính P(n) = 1.3.5...(2n + 1) với n >= 0");
        System.out.println("Nhap so n");
        int input = kb.nextInt();
        System.out.println(multiplyOddNumber(input));
    }

    public static int multiplyOddNumber(int input) {
        if (input == 1) {
            return 1;
        } else {
            return ((2 * (input-1) + 1) * multiplyOddNumber(input -1));
        }
    }
}
