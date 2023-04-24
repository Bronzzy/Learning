import java.util.Scanner;

public class BookClubPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of books you have purchased this month");
        int books = scanner.nextInt();

        if (books < 1)
            System.out.println("You earn 0 points");
        else if (books < 2)
            System.out.println("You earn 5 points");
        else if (books < 3)
            System.out.println("You earn 15 points");
        else if (books < 4)
            System.out.println("You aren 30 points");
        else
            System.out.println("You earn 60 points");
    }
}
