package problem7;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Product nuocTuong = new Product("Nước tương", "sp4", 8000);
        Product gao = new Product("Gạo", "sp1", 18000);
        Product gao1 = new Product("Gạo", "sp1", 18000);
        Product duong = new Product("Đường", "sp3", 10000);

        Order order = new Order(1, LocalDate.now());

        order.addLineItem(nuocTuong, 10);
        order.addLineItem(gao, 5);
        order.addLineItem(duong, 1);
        order.addLineItem(gao1, 1);

        System.out.print("Mã HD: " + order.getOrderID());
        System.out.print("\nNgày lập hóa đơn: " + order.getOrderDate());
        System.out.printf("\n%-6s | %-16s | %10s | %10s | %10s %n", "Mã sp", "Mô tả", "Đơn giá", "Số lượng", "Thành tiền");
        for (OrderDetail detail : order.getLineItems()) {
            System.out.println(detail + " " + detail.calcTotalPrice());
        }
        System.out.println("Tổng tiền thanh toán " + order.calcTotalCharge());
    }
}

