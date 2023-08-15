import java.util.Scanner;

public class AverageRainfall
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int years = 0;
        double rainfall = 0;
        int months = 12;
        double totalMonths = 0;

        System.out.println("Enter a number of years");
        years = scanner.nextInt();
        if (years < 1)
            return;

        for (int i = 1; i <= years; i++)
        {
            for(int b = 1; b <= months; b++)
            {
                System.out.println("Enter inches of rainfall of month " + b + " of year " + i);
                rainfall = scanner.nextDouble();
            }
        }
        double totalRain = rainfall * months;
        double averageRain = totalRain / months;
        totalMonths = months * years;

        System.out.println("Total month\t\t" + "Total Rain\t\t" + "Average rain");
        System.out.println(totalMonths + "\t\t\t\t " + totalRain + "\t\t\t\t" + averageRain + "%");
    }
}
