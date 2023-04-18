package shop;

import java.util.ArrayList;
import java.util.List;

public class Food extends SellingItem{
    private double price;

    public Food(String itemID, double cost, int itemNum, String description, String sellDate) throws PositiveNumber, OutOfRange {
        super(itemID, cost, itemNum, description, sellDate);
    }

    public Food() {
    }

    public double getPrice() {
       return getCost()*1.2;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + getPrice() +
                '}';
    }
}
