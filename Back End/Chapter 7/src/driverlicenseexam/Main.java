package driverlicenseexam;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] correctAnswer = new String[]{"B", "D", "A", "A", "C", "A", "B", "A", "C", "D", "B", "C", "D", "A", "D", "C", "C", "D", "D", "A"};

        final int LIMIT = 20;
        String[] answer = new String[LIMIT];

        for (int index = 0; index < answer.length; index++) {
            System.out.println("Enter your answer (Press ENTER if you want to skip)");
            String input = scanner.nextLine().toUpperCase();
            while (!input.equals("A") && !input.equals("B") && !input.equals("C") && !input.equals("D") && !input.equals("")) {
                System.out.println("Invalid, answer again");
                input = scanner.nextLine().toUpperCase();
            }
            answer[index] = input;
        }
        DriverExam sheet = new DriverExam(correctAnswer, answer);
        sheet.totalCorrect();
        sheet.totalIncorrect();
        sheet.totalMisses();
    }
}
