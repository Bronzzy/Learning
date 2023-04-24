public class StockTransactionProgram {
    public static void main(String[] args) {
        double buyPrice, sellPrice,buyCommission, sellCommission;
        int stock = 1000;

        System.out.println("Amount of money paid for stock: \n"+stock*32.87);
        System.out.println("Amount of money paid for broker when bought the stock: \n"+(stock*32.87)*0.02);
        System.out.println("Amount of money get when sell stock: \n"+stock*33.92);
        System.out.println("Amount of money paid for broker when sell the stock: \n"+(stock*33.92)*0.02);
        System.out.println("Joe profit: \n"+((stock*33.92-((stock*33.92)*0.02)) - (stock*32.87+((stock*32.87)*0.02))));
    }
}
