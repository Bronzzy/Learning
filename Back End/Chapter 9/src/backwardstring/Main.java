package backwardstring;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = kb.nextLine();

        BackwardString backwardString = new BackwardString(str);

        backwardString.getBackwardString();
    }
}
