package problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of item you want to add");
        int n = kb.nextInt();

        try {
            for (int i = 0; i < n; i++) {
                System.out.println("Menu" +
                        "\n1.Add a drink item" +
                        "\n2.Add a food item" +
                        "\n3.Add an other item");
                int menu = kb.nextInt();
                switch (menu) {
                    case 1: {
                        System.out.println("Adding drink item");
                    }
                }
            }
        } catch ()
    }
}
