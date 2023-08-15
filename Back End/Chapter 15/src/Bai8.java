import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Tính S(n)=1+3+5+...+(2.n+1) với n>=0\n");
        System.out.println("Nhap so n");
        int input = kb.nextInt();
        System.out.println(sumOddNumber(input));
    }

    public static int sumOddNumber(int input) {
        if (input == 1) {
            return 1;
        } else {
            return ((2 * (input-1) + 1) + sumOddNumber(input -1));
        }
    }
}
