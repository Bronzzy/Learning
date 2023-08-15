package populationdata;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Integer> arrayFile = new ArrayList<>();
        File myFile = new File("USPopulation.txt");

        Scanner scanner = new Scanner(myFile);
        while (scanner.hasNext()) {
            String textLine = scanner.nextLine();
            arrayFile.add(Integer.parseInt(textLine));
        }
        scanner.close();
//        for (Integer temp : arrayFile)
//            System.out.println(temp);

        double sum = 0;
        double average;
        int a = arrayFile.size();

        for (int i = 0; i < a - 2; i++) {
            sum += (arrayFile.get(i + 1) - arrayFile.get(i));
        }
        sum += (arrayFile.get(a - 1) - arrayFile.get(a - 2));
        average = sum / (a - 1);
        System.out.println("The annual change average is: " + average);

        int temp = 0;
        int highest = arrayFile.get(1) - arrayFile.get(0);
        for (int i = 1; i < a - 2; i++) {
            if (arrayFile.get(i + 1) - arrayFile.get(i) > highest) {
                highest = (arrayFile.get(i + 1) - arrayFile.get(i));
                temp = (i + 1);
            }
        }
        if ((arrayFile.get(a - 1) - arrayFile.get(a - 2)) > highest) {
            highest = (arrayFile.get(a - 1) - arrayFile.get(a - 2));
            temp = a - 1;
        }
        System.out.println("Year " + temp + " has the greatest increase in population of " + highest);

        int temp1 = 0;
        int lowest = arrayFile.get(1) - arrayFile.get(0);
        for (int i = 1; i < a - 2; i++) {
            if (arrayFile.get(i + 1) - arrayFile.get(i) < lowest) {
                lowest = (arrayFile.get(i + 1) - arrayFile.get(i));
                temp1 = (i + 1);
            }
        }
        if ((arrayFile.get(a - 1) - arrayFile.get(a - 2)) > lowest) {
            lowest = (arrayFile.get(a - 1) - arrayFile.get(a - 2));
            temp1 = a - 1;
        }
        System.out.println("Year " + temp1 + " has the smallest increase in population of " + lowest);
    }
}