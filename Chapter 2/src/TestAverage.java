import java.util.Scanner;

public class TestAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Test 1 grade: ");
        double test1Grade = scanner.nextDouble();

        System.out.println("Enter your Test 2 grade: ");
        double test2Grade = scanner.nextDouble();

        System.out.println("Enter your test 3 grade:");
        double test3Grade = scanner.nextDouble();

        System.out.println("Here are your Grade");

        System.out.println("Test 1 grade: "+test1Grade+"\n"+"Test 2 grade: "+test2Grade+"\n"+"Test 3 grade: "+ test3Grade);
        double averageScore = (test1Grade + test2Grade + test3Grade)/3;

        System.out.println("Your average score is: "+averageScore);
    }
}
