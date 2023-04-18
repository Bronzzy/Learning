package problem5;

public class ItemCostPositiveNumber extends  Exception{
    public ItemCostPositiveNumber(double cost) {
        super("Item cost can't be negative");
    }
}
