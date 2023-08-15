import java.util.Scanner;

public class SecondLargestNumber
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number,
                smallest,
                largest;

        System.out.println("Enter the number of integer: ");
        int series = scanner.nextInt();
        System.out.println("Enter integer");
        number = scanner.nextInt();
        smallest = number;
        largest = number;

        for (int i = 1; i < series; i++) {
        System.out.println("Enter integer");
        number = scanner.nextInt();
        if (number < smallest) {
            smallest = number;
        }
        if (number > largest) {
            largest = number;
        }
    }
        System.out.println(smallest);
        System.out.println(largest);
        }

    }
