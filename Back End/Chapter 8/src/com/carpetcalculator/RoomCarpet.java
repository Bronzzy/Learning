package com.carpetcalculator;

import java.math.RoundingMode;

public class RoomCarpet {

    private double costPerSquare;
    private RoomDimension size;

    public RoomCarpet(double costPerSquare, RoomDimension size) {
        this.costPerSquare = costPerSquare;
        this.size = new RoomDimension(size);
    }

    public double getCost() {
        double cost = costPerSquare * size.getArea();
        return cost;
    }
}
