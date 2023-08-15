package problem5;

import java.util.Date;

public class Other extends SellingItem{
    public Other(String itemID, double itemCost, int itemNum, String description, Date sellingDate) {
        super(itemID, itemCost, itemNum, description, sellingDate);
    }

    @Override
    public double getPrice() {
        return super.getPrice() * 1.3;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
