package testscoreclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TestScores score = new TestScores();

        System.out.println("Enter #1 score");
        double score1 = scanner.nextDouble();

        System.out.println("Enter #2 score");
        double score2 = scanner.nextDouble();

        System.out.println("Enter #3 score");
        double score3 = scanner.nextDouble();

        score.setScore1(score1);
        score.setScore2(score2);
        score.setScore3(score3);

        System.out.printf("Average score is: %.2f", score.averageScore());
    }
}
