package gradebookmodification;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int STUDENTLIMIT = 5;
        String[] studentNames = new String[STUDENTLIMIT];
        double[] score1 = new double[4];
        double[] score2 = new double[4];
        double[] score3 = new double[4];
        double[] score4 = new double[4];
        double[] score5 = new double[4];

        for (int index = 0; index < studentNames.length; index++) {
            System.out.println("Enter student " + (index + 1) + " name");
            studentNames[index] = scanner.nextLine();
        }
        for (int index = 0; index < 4; index++) {
            System.out.println("Enter score for student 1");
            double number = scanner.nextDouble();
            while (number < 0 || number > 100) {
                System.out.println("Invalid score, input again");
                number = scanner.nextDouble();
            }
            score1[index] = number;
        }
        for (int index = 0; index < 4; index++) {
            System.out.println("Enter score for student 2");
            double number = scanner.nextDouble();
            while (number < 0 || number > 100) {
                System.out.println("Invalid score, input again");
                number = scanner.nextDouble();
            }
            score2[index] = number;
        }
        for (int index = 0; index < 4; index++) {
            System.out.println("Enter score for student 3");
            double number = scanner.nextDouble();
            while (number < 0 || number > 100) {
                System.out.println("Invalid score, input again");
                number = scanner.nextDouble();
            }
            score3[index] = number;
        }
        for (int index = 0; index < 4; index++) {
            System.out.println("Enter score for student 4");
            double number = scanner.nextDouble();
            while (number < 0 || number > 100) {
                System.out.println("Invalid score, input again");
                number = scanner.nextDouble();
            }
            score4[index] = number;
        }
        for (int index = 0; index < 4; index++) {
            System.out.println("Enter score for student 5");
            double number = scanner.nextDouble();
            while (number < 0 || number > 100) {
                System.out.println("Invalid score, input again");
                number = scanner.nextDouble();
            }
            score5[index] = number;
        }
        GradeBookModification gb = new GradeBookModification(studentNames, score1, score2, score3, score4, score5);

        gb.getStudentNames(0);
        gb.dropLowestScore(score1);
        gb.gradeScore(gb.dropLowestScore(score1));
        System.out.println();

        gb.getStudentNames(1);
        gb.dropLowestScore(score2);
        gb.gradeScore(gb.dropLowestScore(score2));
        System.out.println();

        gb.getStudentNames(2);
        gb.dropLowestScore(score3);
        gb.gradeScore(gb.dropLowestScore(score3));
        System.out.println();

        gb.getStudentNames(3);
        gb.dropLowestScore(score4);
        gb.gradeScore(gb.dropLowestScore(score4));
        System.out.println();

        gb.getStudentNames(4);
        gb.dropLowestScore(score5);
        gb.gradeScore(gb.dropLowestScore(score5));

    }
}