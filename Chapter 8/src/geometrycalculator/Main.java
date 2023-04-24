package geometrycalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geometry Calculator");
        int input;
        do {
            System.out.println("1. Calculate Area of a Circle" +
                    "\n2. Calculate Area of a Rectangle" +
                    "\n3. Calculate Area of a Triangle" +
                    "\n4. Quit");
            input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Enter the circle radius");
                double radius = scanner.nextDouble();
                System.out.printf("The area of the circle is: %.2f\n\n", getCircleArea(radius));
            }
            if (input == 2) {
                System.out.println("Enter the rectangle length");
                double length = scanner.nextDouble();
                System.out.println("Enter the rectangle width");
                double width = scanner.nextDouble();
                System.out.printf("The area of rectangle is: %.2f\n\n", getRectangleArea(length, width));
            }
            if (input == 3) {
                System.out.println("Enter the triangle base");
                double base = scanner.nextDouble();
                System.out.println("Enter the triangle height");
                double height = scanner.nextDouble();
                System.out.printf("The area of the triangle is: %.2f\n\n", getTriangleArea(base, height));
            }
            if (input > 4) {
                System.out.println("Invalid input, try again");
            }
        } while (input != 4);
    }


    public static double getCircleArea(double radius) {
        double area = Math.PI * radius;
        return area;
    }

    public static double getRectangleArea(double length, double width) {
        double area = length * width;
        return area;
    }

    public static double getTriangleArea(double base, double height) {
        double area = base * height * 0.5;
        return area;
    }
}
