package problem7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Order {
    private int orderID;
    private LocalDate orderDate;
    private ArrayList<OrderDetail> lineItems = new ArrayList<>();
    private int count;

    public Order(int orderID, LocalDate orderDate) {
        this.orderID = orderID;
        this.orderDate = orderDate;
    }

    public int getOrderID() {
        return orderID;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public ArrayList<OrderDetail> getLineItems() {
        return lineItems;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public void addLineItem(Product product, int count) {
        lineItems.add(new OrderDetail(count, product));
    }

    public double calcTotalCharge() {
        int total = 0;
        for (int i = 0; i < lineItems.size(); i++) {
            total += lineItems.get(i).calcTotalPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderDate=" + orderDate +
                ", lineItems=" + lineItems +
                ", count=" + count +
                '}';
    }
}
