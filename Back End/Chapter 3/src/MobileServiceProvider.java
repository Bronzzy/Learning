import java.util.Scanner;

public class MobileServiceProvider
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you package");
        String mobilePackage = scanner.nextLine();

        if(mobilePackage.equalsIgnoreCase("C"))
            System.out.println("Your bill is: $69.99");

        System.out.println("Please enter number of minutes were used");
        int minutes = scanner.nextInt();
        double packAPrice, packBPrice;
        packAPrice = (minutes - 450) * 0.45 + 39.99;
        packBPrice = (minutes - 450) * 0.4 + 59.99;

        if (mobilePackage.equalsIgnoreCase("A"))
        {
            if (minutes > 450)
            {
                System.out.println("Your bill is: $" + packAPrice);
            }
        }
        if (mobilePackage.equalsIgnoreCase("B"))
        {
            if (minutes > 450)
            {
                System.out.println("Your bill is: $" + packBPrice+59.99);
            }
        }
    }
}

