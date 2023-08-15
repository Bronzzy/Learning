package circleclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Circle circle = new Circle();

        System.out.println("Enter circle's radius");
        double radius = scanner.nextDouble();

        circle.setRadius(radius);

        System.out.printf("Circle area is: %.2f", circle.area());
        System.out.printf("\nCircle diameter is: %.2f", circle.circumference());
        System.out.printf("\nCircle circumference is: %.2f", circle.diameter());
    }
}
