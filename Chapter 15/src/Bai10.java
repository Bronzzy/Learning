import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Tính S(n)=1+1.2+1.2.3+...+1.2.3...n với n>0");
        System.out.println("Nhap so n");
        int input = kb.nextInt();
        System.out.println(sumFactorial(input));
    }

    public static int sumFactorial(int input) {
        if (input == 1) {
            return 1;
        } else {
            return factorial(input) + sumFactorial((input - 1));
        }
    }

    public static int factorial(int input1) {
        if (input1 == 1) {
            return 1;
        } else {
            return input1 * factorial(input1 - 1);
        }
    }
}
