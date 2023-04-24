import java.util.Scanner;

public class TestScoresAndGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your #1 Score");
        double score1 = scanner.nextDouble();

        System.out.println("Enter your #2 score");
        double score2 = scanner.nextDouble();

        System.out.println("Enter your #3 score");
        double score3 = scanner.nextDouble();

        double average = (score1 + score2 + score3)/3;
        System.out.println("Your average score is: "+average);

        if (average < 60)
            System.out.println("F");
        else if (average < 70)
            System.out.println("D");
        else if (average < 80)
            System.out.println("C");
        else if (average < 90)
            System.out.println("B");
        else if (average <= 100)
            System.out.println("A");

//        if (average >= 90 && average <= 100)
//            System.out.println("A");
//        if (average >= 80 && average <= 89)
//            System.out.println("B");
//        if (average >= 70 && average <= 79)
//            System.out.println("C");
//        if (average >= 60 && average <= 69)
//            System.out.println("D");
//        else
//            System.out.println("F");

    }
}
