import java.util.Scanner;

public class SalesTax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the amount of a purchase");
        int amount = scanner.nextInt();

        double stateSalesTax = amount * 0.04 ;
        double countrySalesTax = amount * 0.02;
        double totalSalesTax = stateSalesTax + countrySalesTax;
        double totalSales = amount + totalSalesTax;

        System.out.println("Your purchase is: " + amount);
        System.out.println("The state sales tax is: "+stateSalesTax);
        System.out.println("The country sales tax is "+countrySalesTax);
        System.out.println("Total sales tax is: "+totalSalesTax);
        System.out.println("Your total sales will be: "+totalSales);

    }
}