import java.util.Scanner;

public class RomanNumerals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a number:");
        int number = scanner.nextInt();


        if (number >= 1 && number <= 10)
        {
            if (number == 1)
                System.out.println("Your Roman numerals is: I");
            else if (number == 2)
                System.out.println("Your Roman numerals is: II");
            else if (number == 3)
                System.out.println("Your Roman numerals is: III");
            else if (number == 4)
                System.out.println("Your Roman numerals is: IV");
            else if (number == 5)
                System.out.println("Your Roman numerals is: V");
            else if (number == 6)
                System.out.println("Your Roman numerals is: VI");
            else if (number == 7)
                System.out.println("Your Roman numerals is: VII");
            else if (number == 8)
                System.out.println("Your Roman numerals is: VIII");
            else if (number == 9)
                System.out.println("Your Roman numerals is: IX");
            else if (number == 10)
                System.out.println("Your Roman numerals is: X");
        }
            else
                System.out.println("error");
    }
}


//        switch (number)
//        {
//            case 1:
//                System.out.println("Your Roman numeral is: I");
//                break;
//            case 2:
//                System.out.println("Your Roman numeral is: II");
//                break;
//            case 3:
//                System.out.println("Your Roman numeral is: III");
//                break;
//            case 4:
//                System.out.println("Your Roman numeral is: IV");
//                break;
//            case 5:
//                System.out.println("Your Roman numeral is: V");
//                break;
//            case 6:
//                System.out.println("Your Roman numeral is: VI");
//                break;
//            case 7:
//                System.out.println("Your Roman numeral is: VII");
//                break;
//            case 8:
//                System.out.println("Your Roman numeral is: VIII");
//                break;
//            case 9:
//                System.out.println("Your Roman numeral is: IX");
//                break;
//            case 10:
//                System.out.println("Your Roman numeral is: X");
//                break;
//            default:
//                System.out.println("Error");
//        }



