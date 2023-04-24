
public class Area {

    public static double getArea(double radius) {
        double area = 3.1415 * radius;
        return area;

    }

    public static double getArea(double width, double length) {
        double area = width * length;
        return area;
    }

    public static double getArea(double pi, double radius, double height) {
        double area = pi * height * Math.pow(radius, 2);
        return area;
    }


    public static void main(String[] args) {
        System.out.printf("Area of a circle: %s%n", getArea(10));
        System.out.printf("Area of a circle: %s%n", getArea(10, 20));
        System.out.printf("Area of a circle: %s%n", getArea(3.14, 10, 20));
    }
}
