package cashregister;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of quantity");
        int quantity = scanner.nextInt();
        System.out.println("Enter item price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        CashRegister cr = new CashRegister(new Retail(price), quantity);

        System.out.printf("The sub total is: %.2f", cr.getSubTotal());
        System.out.printf("\nThe sales tax is: %.2f", cr.getTax());
        System.out.printf("\nThe total is: %.2f", cr.getTotal());

        System.out.println("\nHow do you want to name your file");
        String fileName = scanner.nextLine();
        PrintWriter writer = new PrintWriter(fileName);
        writer.println("SALES RECEIPT");
        writer.printf("Unit prices: $%.2f",price);
        writer.printf("\nQuantity: %d",quantity);
        writer.printf("\nSubtotal: $%.2f",cr.getSubTotal());
        writer.printf("\nSales Tax: $%.2f",cr.getTax());
        writer.printf("\nTotal: $%.2f",cr.getTotal());
        writer.close();
    }
}