package problem5;

import java.util.Date;

public class Food extends SellingItem{

    public Food(String itemID, double itemCost, int itemNum, String description, Date sellingDate) {
        super(itemID, itemCost, itemNum, description, sellingDate);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.2;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
