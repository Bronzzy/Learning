package shop;

public class OutOfItemNumber extends Exception{
    public OutOfItemNumber(double n) {
        super("Number of times must be within 1 to 100");
    }
}

