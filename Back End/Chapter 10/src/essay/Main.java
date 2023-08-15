package essay;

public class Main {

    public static void main(String[] args) {
        GradeActivity exam1 = new Essay(85,30, 20, 10, 25);
        Essay essay = new Essay(85,30,20,10,25);

        exam1.setScore(essay.totalScores());
        System.out.println("The Grade is: " + exam1.getGrade());
    }
}
