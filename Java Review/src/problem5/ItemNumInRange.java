package problem5;

public class ItemNumInRange extends Exception{
    public ItemNumInRange(int itemNum) {
        super("Number of item must be in between 1 and 20");
    }
}
