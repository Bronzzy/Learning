package lotterystatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int[] lottery = new int[5];

        for (int i = 0; i < lottery.length; i++){
            System.out.println("Enter a number");
            lottery[i] = kb.nextInt();
        }
        System.out.println("Enter a number for power + ball");
        int powerBall = kb.nextInt();

    }
}
