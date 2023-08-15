import java.util.Scanner;
public class SortedNames
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String name1;
        String name2;
        String name3;

        System.out.println("Please Enter First Name ");
        name1 = scanner.nextLine();
        System.out.println("Please Enter Second Name ");
        name2 = scanner.nextLine();
        System.out.println("Please Enter Third Name ");
        name3 = scanner.nextLine();

        if ((name1.compareTo(name2) < 0) && (name1.compareTo(name3) < 0))
        {
            System.out.println(name1);
            if (name2.compareTo(name3) < 0)
            {
                System.out.println(name2);
                System.out.println(name3);
            }
            else
            {
                System.out.println(name3);
                System.out.println(name2);
            }
        }
        else if ((name1.compareTo(name2) > 0) && (name2.compareTo(name3) < 0))
        {
            System.out.println(name2);
            if (name1.compareTo(name3) < 0)
            {
                System.out.println(name1);
                System.out.println(name3);
            }
            else
            {
                System.out.println(name3);
                System.out.println(name1);
            }
        }
        else
        {
        System.out.println(name3);
        if (name1.compareTo(name2) < 0)
        {
            System.out.println(name1);
            System.out.println(name2);
        }
            else
            {
                System.out.println(name2);
                System.out.println(name1);
            }
        }
    }
}