import java.util.Scanner;

public class StockCommission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double stock = 600;
        double price = 21.77;

        System.out.println("Amount paid for the stock alone: \n" +(stock * price) );
        System.out.println("Amount of the commission: \n"+ ((stock+price)*0.02));
        System.out.println("The total amount paid: \n"+ ((stock*price)+((stock+price)*0.02)));

    }
}
