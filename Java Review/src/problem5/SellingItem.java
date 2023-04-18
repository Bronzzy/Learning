package problem5;

import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class SellingItem {
    protected String itemID;
    protected double itemCost;
    protected int itemNum;
    protected String description;
    protected Date sellingDate;

    public SellingItem(String itemID, double itemCost, int itemNum, String description, Date sellingDate) throws ItemCostPositiveNumber, ItemNumInRange {
        if (isValidId(itemID)) {
            this.itemID = itemID;
        }else{
            System.out.println("The itemID formar is LL-XXXX" +
                    "where L is letter and X is number");
        }
        this.itemCost = itemCost;
        if (itemCost < 0) {
            throw new ItemCostPositiveNumber(itemCost);
        }
        this.itemNum = itemNum;
        if (itemNum < 1 || itemNum > 20) {
            throw new ItemNumInRange(itemNum);
        }
        this.description = description;
        this.sellingDate = sellingDate;
    }

    public abstract double getPrice();

    public static boolean isValidId(String id) {
        String regex = "^[a-zA-Z]{2}" + "-" + "[0-9]{4}";
        Pattern p = Pattern.compile(regex);
        if (id == null) {
            return false;
        }
        Matcher m = p.matcher(id);
        return m.matches();
    }

    @Override
    public String toString() {
        return "SellingItem" +
                "\nItem ID: " + itemID +
                "\nItem Cost:" + itemCost +
                "\nItem Num: " + itemNum +
                "\nDescription: " + description +
                "\nSelling Date: " + sellingDate;
    }
}
