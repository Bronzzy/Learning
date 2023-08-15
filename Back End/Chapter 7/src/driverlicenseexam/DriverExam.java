package driverlicenseexam;

public class DriverExam {

    private String[] correctAnswer;
    private String[] studentAnswer;

    public DriverExam(String[] correctAnswer, String[] studentAnswer) {
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
    }

    public void totalCorrect() {
        int temp = 0;
        for (int count = 0; count < correctAnswer.length; count++) {
            if (correctAnswer[count].equals(studentAnswer[count])) {
                temp++;
            }
        }
        System.out.println("You answer correct " + temp + " times");
    }

    public void totalIncorrect() {
        int temp = 0;
        for (int count = 0; count < correctAnswer.length; count++) {
            if (!correctAnswer[count].equals(studentAnswer[count])) {
                temp++;
            }
        }
        System.out.println("You answer incorrect " + temp + " times");
    }

    public void totalMisses() {
        int temp = 0;
        System.out.print("You answer wrong question:");
        for (int count = 0; count < correctAnswer.length; count++) {
            if (!correctAnswer[count].equals(studentAnswer[count])) {
                System.out.print("\t" + (count + 1));
            }
        }
    }
}
