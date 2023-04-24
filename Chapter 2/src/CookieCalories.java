import java.util.Scanner;

public class CookieCalories {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of cookies you ate");
        int cookies = scanner.nextInt();

        System.out.println("Total calories consumed is : \n"+cookies*30);
    }
}
