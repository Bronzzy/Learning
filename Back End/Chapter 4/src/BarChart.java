import java.util.Scanner;

public class BarChart
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter today sales for store 1: ");
        double store1 = scanner.nextDouble();

        System.out.println("Enter today sales for store 2: ");
        double store2 = scanner.nextDouble();

        System.out.println("Enter today sales for store 3: ");
        double store3 = scanner.nextDouble();

        System.out.println("Enter today sales for store 4: ");
        double store4 = scanner.nextDouble();

        System.out.println("Enter today sales for store 5: ");
        double store5 = scanner.nextDouble();

        int sales1 = (int) (store1 / 100);
        int sales2 = (int) (store2 / 100);
        int sales3 = (int) (store3 / 100);
        int sales4 = (int) (store4 / 100);
        int sales5 = (int) (store5 / 100);

        System.out.println("SALES BAR CHART");

        System.out.print("Store 1: ");
        for(int i = 1; i <= sales1; i++)
            System.out.print("*");

        System.out.print("\nStore 2: ");
        for(int i = 1; i <= sales2; i++)
            System.out.print("*");

        System.out.print("\nStore 3: ");
        for(int i = 1; i <= sales3; i++)
            System.out.print("*");

        System.out.print("\nStore 4: ");
        for(int i = 1; i <= sales4; i++)
            System.out.print("*");

        System.out.print("\nStore 5: ");
        for(int i = 1; i <= sales5; i++)
            System.out.print("*");
    }
}
