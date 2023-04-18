package shop;

public class OutOfRange extends Exception{
    public OutOfRange(int message) {
        super("Number of item must be within 1 to 20");
    }
}
