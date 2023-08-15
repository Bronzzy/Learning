package filearray;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner kb = new Scanner(System.in);

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        System.out.println("Enter file name");
        String filename = kb.nextLine();
        writeArray(filename,array);
        readArray(filename,array);
    }

    public static void writeArray(String filename, int[] array) throws IOException {

        FileOutputStream fStream = new FileOutputStream(filename);
        DataOutputStream outputFile = new DataOutputStream(fStream);

        System.out.println("Writing the numbers to file");

        for (int i = 0; i < array.length; i++) {
            outputFile.writeInt(array[i]);
        }
        System.out.println("Done.");
    }

    public static void readArray(String filename, int[] array) throws IOException {
        int number;
        boolean endOfFiles = false;
        FileInputStream fStream = new FileInputStream(filename);
        DataInputStream inputFile = new DataInputStream(fStream);

        System.out.println("\nReading numbers from file");

        while (!endOfFiles) {
            try {
                number = inputFile.readInt();
                System.out.print(number + " ");
            } catch (EOFException e) {
                endOfFiles = true;
            }
        }
        System.out.println("\nDone");

        inputFile.close();
    }
}
