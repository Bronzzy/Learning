package retailitemclass;

public class Main {
    public static void main(String[] args) {
        Retail item1 = new Retail("Jacket", 12, 59.95);
        Retail item2 = new Retail("Designer Jeans", 40, 34.95);
        Retail item3 = new Retail("Shirt", 20, 24.95);

        System.out.println(item1);
        System.out.println(item2);
        System.out.println(item3);

    }
}
