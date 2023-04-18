package shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Drink extends SellingItem {
    private double price;

    public Drink(String itemID, double cost, int itemNum, String description, String sellDate) throws PositiveNumber, OutOfRange {
        super(itemID, cost, itemNum, description, sellDate);
    }

    public Drink() {
    }

    public double getPrice() {
        return getCost() * 1.1;
    }



    @Override
    public String toString() {
        return "Drink{" +
                "price=" + getPrice() +
                '}';
    }
}
