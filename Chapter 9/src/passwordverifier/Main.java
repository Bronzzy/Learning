package passwordverifier;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("A password should be at least 6 characters long");
        System.out.println("A password should contain at least 1 uppercase and one lowercase letter");
        System.out.println("A password should contain at least 1 number");
        System.out.println("Enter your password");
        String str = kb.nextLine();

        PasswordVerifier passwordVerifier = new PasswordVerifier(str);

        if (passwordVerifier.checkPassWordQualified(str)) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Not a valid password");
        }

    }
}

