import java.sql.SQLOutput;
import java.util.Scanner;

public class WiFiDiagnosticTree
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Reboot the computer to fix the problem");
        System.out.println("Did that fix the problem?");
        char input = scanner.next().toLowerCase().charAt(0);
        if (input == 'n')
            System.out.println("\nReboot the router and try to connect");
        else
        {
            return;
        }
        System.out.println("Did that fix the problem?");
        input = scanner.next().toLowerCase().charAt(0);
        if (input == 'n')
            System.out.println("\nMake sure the cables between the router & modem are plugged in firmly");
        else
        {
            return;
        }

        System.out.println("Did that fix the problem?");
        input = scanner.next().toLowerCase().charAt(0);
        if (input == 'n')
            System.out.println("\nMove the router to a new location and try to reconnect");
        else
        {
            return;
        }

        System.out.println("Did that fix the problem?");
        input = scanner.next().toLowerCase().charAt(0);
        if (input == 'n')
            System.out.println("\nGet a new router");
        else
        {
            return;
        }

    }
}
