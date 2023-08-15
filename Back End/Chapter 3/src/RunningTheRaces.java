import java.util.Scanner;

public class RunningTheRaces
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter runner 1");
        String racer1 = scanner.nextLine();
        System.out.println("Enter minutes runner 1 finish the race");
        double min1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter runner 2");
        String racer2 = scanner.nextLine();
        System.out.println("Enter minutes runner 2 finish the race");
        double min2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Enter runner 3");
        String racer3 = scanner.nextLine();
        System.out.println("Enter minutes runner 3 finish the race");
        double min3 = scanner.nextDouble();
        scanner.nextLine();


        if(min1 > min2)
        {
            if(min2 > min3)
            {
                System.out.println("Runner finished order is: \n" + racer3 + "\n" + racer2 + "\n" + racer1);
            }
            else
            {
                System.out.println("Runner finished order is: \n" + racer2 + "\n" + racer3 + "\n" + racer1);
            }
        }
        if(min2 > min1)
        {
            if(min1 > min3)
            {
                System.out.println("Runner finished order is: \n" + racer3 + "\n" + racer1 + "\n" + racer2);
            }
            else
            {
                System.out.println("Runner finished order is: \n" + racer1 + "\n" + racer3 + "\n" + racer2);
            }
        }
        if(min3 > min2)
        {
            if(min2 > min1)
            {
                System.out.println("Runner finished order is: \n" + racer1 + "\n" + racer2 + "\n" + racer3);
            }
            else
            {
                System.out.println("Runner finished order is: \n" + racer2 + "\n" + racer1 + "\n" + racer3);
            }
        }
    }
}