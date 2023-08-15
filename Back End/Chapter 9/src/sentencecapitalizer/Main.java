package sentencecapitalizer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = kb.nextLine();

        SentenceCapitalizer sentenceCapitalizer = new SentenceCapitalizer(str);
        sentenceCapitalizer.getCapitalize();
    }
}
