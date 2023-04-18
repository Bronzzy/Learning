package problem5;

import java.util.Date;

public class Other extends SellingItem {
    public Other(String itemID, double itemCost, int itemNum, String description, Date sellingDate) throws ItemCostPositiveNumber, ItemNumInRange {
        super(itemID, itemCost, itemNum, description, sellingDate);
    }

    @Override
    public double getPrice() {
        return itemCost * 1.3;
    }
}
