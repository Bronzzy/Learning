package retail;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NegativePrice, NegativeUnit {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter the item description");
        String description = kb.nextLine();

        System.out.println("Enter the unit price");
        double unitPrice = kb.nextDouble();
        if(unitPrice < 0) throw new NegativePrice("Unit price can't be less than 0");

        System.out.println("Enter the number of unit");
        int unitNumber = kb.nextInt();
        if(unitNumber < 0) throw new NegativeUnit("Number of unit can't be less than 0");

        Retail retail = new Retail(description, unitNumber, unitPrice);

        System.out.println(retail);
    }
}
