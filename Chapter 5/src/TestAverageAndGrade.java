import java.util.Scanner;

public class TestAverageAndGrade {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

        System.out.println("Enter your #1 score");
        double score1 = scanner.nextDouble();

        System.out.println("Enter your #2 score");
        double score2 = scanner.nextDouble();

        System.out.println("Enter your #3 score");
        double score3 = scanner.nextDouble();

        System.out.println("Enter your #4 score");
        double score4 = scanner.nextDouble();

        System.out.println("Enter your #5 score");
        double score5 = scanner.nextDouble();
        calcAverage(score1, score2, score3, score4, score5);

        determineGrade(score1);
        determineGrade(score2);
        determineGrade(score3);
        determineGrade(score4);
        determineGrade(score5);
        determineGrade(calcAverage(score1, score2, score3, score4, score5));

    }

    public static double calcAverage(double score1, double score2, double score3, double score4, double score5) {

        Scanner scanner = new Scanner(System.in);

        double totalScores = score1 + score2 + score3 + score4 + score5;
        double averageScores = totalScores/5;

        System.out.println(averageScores);

        return  averageScores;
    }

    public static double determineGrade (double test_result){

        char ranking = ' ';

            if (test_result < 60)
                ranking = 'F';
            else if (test_result < 70)
                ranking = 'D';
            else if (test_result < 80)
                ranking = 'C';
            else if (test_result < 90)
                ranking = 'B';
            else
                ranking = 'A';
        System.out.println(ranking);
        return test_result;
    }
}
