import java.util.Scanner;

public class MobileServiceProviderPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter you package");
        String mobilePackage = scanner.nextLine();

        if(mobilePackage.equalsIgnoreCase("c"))
            System.out.println("Your bill is: $69.99");

        System.out.println("Please enter number of minutes were used");
        int minutes = scanner.nextInt();
        double packAPrice, packBPrice,packCPrice;
        packAPrice = (minutes - 450) * 0.45 + 39.99;
        packBPrice = (minutes - 450) * 0.4 + 59.99;
        packCPrice = 69.99;

        if (mobilePackage.equalsIgnoreCase("a"))
        {
            if (minutes > 450)
            {
                System.out.println("Your bill is: $" + packAPrice);
            }
            if (packAPrice > packBPrice)
            {
                System.out.println("You will save $" + (packAPrice - packBPrice) + " when switch to Pack B");
                System.out.println("You will save $" + (packAPrice - packCPrice) + " when switch to pack C");
            }
        }
    }
}