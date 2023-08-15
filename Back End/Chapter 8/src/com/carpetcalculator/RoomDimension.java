package com.carpetcalculator;

public class RoomDimension {

    private double length;
    private double width;

    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public RoomDimension(RoomDimension obj2) {
        this.length = obj2.length;
        this.width = obj2.width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }
}
