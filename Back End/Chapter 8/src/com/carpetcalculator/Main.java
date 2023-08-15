package com.carpetcalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter room length");
        double length = scanner.nextDouble();
        while (length < 0) {
            System.out.println("Room length can't be negative");
            System.out.println("Enter room length");
            length = scanner.nextDouble();
        }

        System.out.println("Enter room width");
        double width = scanner.nextDouble();
        while (width < 0) {
            System.out.println("Room width can't be negative");
            System.out.println("Enter room width");
            width = scanner.nextDouble();
        }

        RoomDimension room = new RoomDimension(length, width);
        RoomCarpet carpet = new RoomCarpet(8, room);
        System.out.printf("The room area is %.2f", room.getArea());
        System.out.printf("\nTotal cost is $%.2f", carpet.getCost());
    }
}
