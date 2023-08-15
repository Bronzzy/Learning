import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter mark for student 1");
        int score1 = scanner.nextInt();
        while (score1 < 0 || score1 > 100){
            System.out.println("Invalid input, try again");
            score1 = scanner.nextInt();
        }

        System.out.println("Enter mark for student 2");
        int score2 = scanner.nextInt();
        while (score2 < 0 || score2 > 100){
            System.out.println("Invalid input, try again");
            score2 = scanner.nextInt();
        }

        System.out.println("Enter mark for student 3");
        int score3 = scanner.nextInt();
        while (score3 < 0 || score3 > 100){
            System.out.println("Invalid input, try again");
            score3 = scanner.nextInt();
        }

        System.out.println("Enter mark for student 4");
        int score4 = scanner.nextInt();
        while (score4 < 0 || score4 > 100){
            System.out.println("Invalid input, try again");
            score4 = scanner.nextInt();
        }

        double averageScores = (double) (score1 + score2 + score3 + score4) / 4;

        System.out.printf("The average is: %.1f",averageScores);


    }

}
