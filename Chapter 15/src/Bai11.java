import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Tính S(n)=1^2 + 2^2 + 3^2 + .... + n^2 với n>0");
        System.out.println("Nhap so n");
        int input = kb.nextInt();
        System.out.println("Tong: " + luyThua(input));
    }


    public static int luyThua(int input) {
        if (input == 1) {
            return 1;
        } else {
            return (int) (luyThua(input - 1) + Math.pow(input, 2));
        }
    }
}
