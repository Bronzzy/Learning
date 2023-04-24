package carinstrument;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your car fuel");
        double fuel = scanner.nextDouble();

        System.out.println("Enter your current mileage");
        double mileage = scanner.nextDouble();

        FuelGauge fuelGauge = new FuelGauge(fuel);
        Odometer odometer = new Odometer(mileage,fuelGauge);

        odometer.simulateRun();
    }
}
