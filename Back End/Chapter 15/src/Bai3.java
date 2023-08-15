import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter a number");
        int input = kb.nextInt();
        System.out.println(largestNumber(0,input));
    }

    public static int largestNumber(int number ,int input) {
        int highest = 0;
        highest = number;
        if (input == 0) {
            return highest;
        } else {
            if (input % 10 > highest) {
                highest = input % 10;
            }
        }
        return largestNumber(highest, input / 10);
    }
}

