package shop;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Other extends SellingItem{
    private double price;

    public Other(String itemID, double cost, int itemNum, String description, String sellDate)
            throws PositiveNumber, OutOfRange {
        super(itemID, cost, itemNum, description, sellDate);
    }

    public Other() {
    }

    public double getPrice() {
        return getCost()*1.3;
    }

    @Override
    public String toString() {
        return "Other{" +
                "price=" + getPrice() +
                '}';
    }
}
