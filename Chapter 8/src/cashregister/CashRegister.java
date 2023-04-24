package cashregister;

public class CashRegister {
    private int quantity;
    private Retail r;

    public CashRegister(Retail r, int quantity) {
        this.r = r;
        this.quantity = quantity;
    }

    public double getSubTotal() {

        double subTotal = this.quantity * r.getPrice();
        return subTotal;
    }

    public double getTax() {
        double salesTax = getSubTotal() / 100 * 6;
        return salesTax;
    }

    public double getTotal() {
        double getTotal = getTax() + getSubTotal();
        return getTotal;
    }
}
