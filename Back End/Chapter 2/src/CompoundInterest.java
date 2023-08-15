import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Input mount of principal originally deposited into the account");
        double P = scanner.nextDouble();
        System.out.println("Input annual interest rate paid by the account");
        double r = scanner.nextDouble();
        System.out.println("Input number of times per year that the interest in compounded");
        double n = scanner.nextDouble();
        System.out.println("Input number of years the account will be left to earn interest");
        int t = scanner.nextInt();
        double v = 1 + (r / n)/100;
        double x = n*t;
        System.out.println(P*Math.pow(v,x));
    }
}
