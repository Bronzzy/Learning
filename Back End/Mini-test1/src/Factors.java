import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;

        System.out.println("Enter an integer");
        int input = scanner.nextInt();

        System.out.print("Factors of " + input + ": ");
        for (i = 1; i <= input; i++){
            if (input % i == 0){
                System.out.print("\t" + i);
            }
        }
    }
}
