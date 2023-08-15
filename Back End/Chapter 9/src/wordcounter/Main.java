package wordcounter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a string");
        String str = kb.nextLine();

        WordCounter wordCounter = new WordCounter(str);

        System.out.println("Word count is: " + wordCounter.countWord());

    }
}
