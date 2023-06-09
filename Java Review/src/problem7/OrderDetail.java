package problem7;

public class OrderDetail {
    private int quantity;
    private Product product;

    public OrderDetail(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double calcTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return String.format(product + " %10s |", quantity);
    }
}
