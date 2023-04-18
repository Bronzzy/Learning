package shop;

public class PositiveNumber extends Exception{
    public PositiveNumber(double cost) {
        super("Price cannot be negative");
    }
}
