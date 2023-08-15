package chargeaccountvalidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your credit card for checking");
        int input = scanner.nextInt();
        int results;
        int[] creditCard = {5658845, 4520125, 7895122, 877541, 8451277,
                1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
                1005231, 6545231, 3852085, 7576651, 7881200, 4581002};

        Validate cred = new Validate(creditCard);

        results = cred.sequentialSearch(creditCard, input);

        if (results == -1) {
            System.out.println("Your card is invalid");
        } else {
            System.out.println("Your card is valid");
        }
    }
}
