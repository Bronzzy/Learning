import java.util.Locale;
import java.util.Scanner;

public class RestaurantSelector
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        boolean joe = true, mainStreet = true, corner = true, mama = true, chef = true;

        System.out.println("Is anyone in your party a vegetarian");
        char veg = scanner.next().toLowerCase().charAt(0);
        if (veg == 'y')
        {
            joe = false;
        }

        System.out.println("Is anyone in your party a vegan");
        char vegan = scanner.next().toLowerCase().charAt(0);
        if (vegan == 'y')
        {
            joe = false;
            mainStreet = false;
            mama = false;
        }

        System.out.println("Is anyone in your party gluten-free");
        char gluten = scanner.next().toLowerCase().charAt(0);
        if (gluten == 'y')
        {
            joe = false;
            mama = false;
        }

        System.out.println("\nHere are your options:");
        if(joe)
            System.out.println("Joe's gourmet burger");
        if(mainStreet)
            System.out.println("Main Street Pizza Company");
        if(corner)
            System.out.println("Corner's Cafe");
        if(mama)
            System.out.println("Mama's Fine Kitchen");
        if(chef)
            System.out.println("The Chef's Kitchen");







//        if (vegetarians.equalsIgnoreCase("yes"))
//        {
//            if(vegan.equalsIgnoreCase("yes"))
//            {
//                if(gluten.equalsIgnoreCase("yes"))
//                {
//                    System.out.println("Your options are:");
//                    System.out.println("Chef's Kitchen");
//                    System.out.println("Corner Cafe");
//                }
//                else
//                {
//                    System.out.println("Your options are: ");
//                    System.out.println("None ");
//                }
//            }
//            if(vegan.equalsIgnoreCase("no"))
//            {
//                if(gluten.equalsIgnoreCase("yes"))
//                {
//                    System.out.println("Your options are:");
//                    System.out.println("Main Street Pizza Company");
//                }
//                else
//                {
//                    System.out.println("Your options are:");
//                    System.out.println("Mama's Fine Italian");
//                }
//            }
//        }
//        if (vegetarians.equalsIgnoreCase("no"))
//        {
//            if (vegan.equalsIgnoreCase("yes"))
//            {
//                if (gluten.equalsIgnoreCase("yes"))
//                {
//                    System.out.println("Your options are: ");
//                    System.out.println("None");
//                }
//                else
//                {
//                    System.out.println("Your options are");
//                    System.out.println("");
//                }
//            }
//        }
    }
}
