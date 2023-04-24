import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter an integer");
        int input = scanner.nextInt();

        while (input != 0){
            sum += input % 10;
            input = input / 10;
        }
        System.out.println("The sums of digit is: " + sum);
    }

}
