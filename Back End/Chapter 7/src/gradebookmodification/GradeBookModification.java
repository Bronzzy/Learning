package gradebookmodification;

public class GradeBookModification {

    private String[] studentNames;
    private String[] studentGrade = {"A", "B", "C", "D", "F"};
    private double[] score1;
    private double[] score2;
    private double[] score3;
    private double[] score4;
    private double[] score5;

    public GradeBookModification(String[] studentNames, double[] score1, double[] score2, double[] score3, double[] score4, double[] score5) {
        this.studentNames = studentNames;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.score5 = score5;
    }

    public String getStudentNames(int i) {
        System.out.println("Student " + studentNames[i]);
        return studentNames[i];
    }

    public double getAverage1() {

        double average = 0;
        double sum = 0;

        for (int index = 0; index < score1.length; index++) {
            sum += score1[index];
            average = sum / score1.length;
        }
        System.out.println("Student 1 average score is: " + average);
        return average;
    }

    public double getAverage2() {
        double average = 0;
        double sum = 0;

        for (int index = 0; index < score2.length; index++) {
            sum += score2[index];
            average = sum / score2.length;
        }
        System.out.println("Student 2 average score is: " + average);
        return average;
    }

    public double getAverage3() {
        double average = 0;
        double sum = 0;

        for (int index = 0; index < score3.length; index++) {
            sum += score3[index];
            average = sum / score3.length;
        }
        System.out.println("Student 3 average score is: " + average);
        return average;
    }

    public double getAverage4() {
        double average = 0;
        double sum = 0;

        for (int index = 0; index < score4.length; index++) {
            sum += score4[index];
            average = sum / score4.length;
        }
        System.out.println("Student 4 average score is: " + average);
        return average;
    }

    public double getAverage5() {
        double average = 0;
        double sum = 0;

        for (int index = 0; index < score5.length; index++) {
            sum += score5[index];
            average = sum / score5.length;
        }
        System.out.println("Student 5 average score is: " + average);
        return average;
    }

    public void gradeScore(double average) {
        String grade = "";

        if (average < 60) {
            grade = studentGrade[4];
        } else if (average < 70) {
            grade = studentGrade[3];
        } else if (average < 80) {
            grade = studentGrade[2];
        } else if (average < 90) {
            grade = studentGrade[1];
        } else {
            grade = studentGrade[0];
        }
        System.out.println("The grade for average score is: " + grade);
    }

    public double dropLowestScore(double[] score) {
        double lowest = score[0];
        double total = 0;
        for (int i = 1; i < score.length; i++) {
            if (score[i] < lowest) {
                score[i] = lowest;
            }
        }
        for (int index = 0; index < score.length; index++) {
            total += score[index];
        }
        double temp = (total - lowest) / (score.length - 1);
        return temp;
    }
}
