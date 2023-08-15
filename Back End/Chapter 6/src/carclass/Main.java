package carclass;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car(1980, "Audi");
        for (int i = 1; i <= 5; i++) {
            audi.accelerate();
        }
        System.out.println(audi.getSpeed());
        for (int i = 1; i <= 5; i++) {
            audi.brake();
        }
        System.out.println(audi.getSpeed());
    }
}
