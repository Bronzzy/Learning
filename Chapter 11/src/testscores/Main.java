package testscores;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidTestScore {
        Scanner kb = new Scanner(System.in);

        double[] testScore = new double[5];

        for (int i = 0; i < testScore.length; i++) {
            System.out.println("Enter score");
            double score = kb.nextDouble();
            if(score < 0 || score > 100) throw new InvalidTestScore("Score must be between 0 and 100");
            testScore[i] = score;
        }
        TestScores testScores = new TestScores(testScore);
        testScores.getAverage();
    }
}
