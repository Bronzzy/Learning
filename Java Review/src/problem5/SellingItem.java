package problem5;

import java.util.Date;

public abstract class SellingItem {
    private String itemID;
    private double itemCost;
    private int itemNum;
    private String description;
    private Date sellingDate;

    public SellingItem(String itemID, double itemCost, int itemNum, String description, Date sellingDate) {
        this.itemID = itemID;
        this.itemCost = itemCost;
        this.itemNum = itemNum;
        this.description = description;
        this.sellingDate = sellingDate;
    }
    public double getPrice(){
        return itemCost;
    }

    @Override
    public String toString() {
        return "SellingItem{" +
                "itemID='" + itemID + '\'' +
                ", itemCost=" + itemCost +
                ", itemNum=" + itemNum +
                ", description='" + description + '\'' +
                ", sellingDate=" + sellingDate +
                '}';
    }
}
