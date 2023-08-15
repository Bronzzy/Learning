package circleclass;

public class Circle {

    private double radius;
    private final double pi = 3.1415;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this.radius = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area() {
        double area = pi * getRadius() * getRadius();
        return area;
    }

    public double diameter() {
        double diameter = getRadius() * 2;
        return diameter;
    }

    public double circumference() {
        double circumference = 2 * pi * getRadius();
        return circumference;
    }
}
