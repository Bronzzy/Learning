package rainfallclass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int MONTHS = 12;
        double[] rainfall = new double[MONTHS];

        RainFall rf = new RainFall(rainfall);

        for (int index = 0; index < rainfall.length; index++) {
            System.out.println("Enter rainfall for month " + (index + 1));
            rainfall[index] = scanner.nextDouble();
        }
        rf.totalRain();
        rf.averageRain();
        rf.mostRain();
        rf.leastRain();
    }
}


