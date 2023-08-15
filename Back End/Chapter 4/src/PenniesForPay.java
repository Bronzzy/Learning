import java.sql.SQLOutput;
import java.util.Scanner;

public class PenniesForPay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pays = 1;

        System.out.println("enter number of day ");
        int days = scanner.nextInt();
        if (days < 1)
            return;
        System.out.println("\tSALARY TABLE");
        System.out.println("--------------------------");


        for (int count = 1; count <= days; count++)
        {
            pays = pays * 2;
            System.out.println(count + "\t\t\t" + pays/100);
        }
    }
}