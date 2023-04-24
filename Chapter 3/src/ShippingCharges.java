import java.util.Scanner;

public class ShippingCharges
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your package weight");
        double packageWeight = scanner.nextDouble();
        System.out.println("Please enter your miles");
        double miles = scanner.nextDouble();

        int actualMiles = (int)(miles/500.1) +1;
        double pricePound1 = 1.10;
        double pricePound2 = 2.20;
        double pricePound3 = 3.70;
        double pricePound4 = 3.80;

        if (packageWeight <= 2.0)
        {
            if (miles > 500)
            {
                System.out.println("Shipping prices is: $" + actualMiles*pricePound1);
            }
            else
            {
                System.out.println("Shipping prices is 1.10");
            }
        }
        if (packageWeight > 2.0 && packageWeight <= 6.0)
        {
            if (miles > 500)
            {
                System.out.println("Shipping prices is: $" + actualMiles*pricePound2);
            }
            else
            {
                System.out.println("Shipping price is $2.20");
            }
        }
        if (packageWeight > 6.0 && packageWeight < 10)
        {
            if (miles > 500)
            {
                System.out.println("Shipping prices is: $" + actualMiles*pricePound3);
            }
            else
            {
                System.out.println("Shipping prices $3.70");
            }
        }
        if (packageWeight > 10)
        {
            if (miles > 500)
            {
                System.out.println("Shipping prices is: $" + actualMiles*pricePound4);
            }
            else
            {
                System.out.println("Shipping prices is: $3.80");
            }
        }
    }
}


