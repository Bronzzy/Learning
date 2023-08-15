package testscoresmodificationforserialization;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        double[] array1 = {50,51,52};
        double[] array2 = {60,61,62};
        double[] array3 = {70,71,72};
        double[] array4 = {80,81,82};
        double[] array5 = {90,91,92};

        TestScores testScores1 = new TestScores(array1);
        TestScores testScores2 = new TestScores(array2);
        TestScores testScores3 = new TestScores(array3);
        TestScores testScores4 = new TestScores(array4);
        TestScores testScores5 = new TestScores(array5);

        TestScores[] objectArray = new TestScores[5];

        objectArray[0] = testScores1;
        objectArray[1] = testScores2;
        objectArray[2] = testScores3;
        objectArray[3] = testScores4;
        objectArray[4] = testScores5;
        
        FileOutputStream outStream = new FileOutputStream("DemoForSerialization.dat");
        ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);

        for(int i = 0; i < objectArray.length; i++){
            objectOutputFile.writeObject(objectArray[i]);
        }
        objectOutputFile.close();
        System.out.println("The serialized object were written to the DemoForSerialization.dat file.\n");


        FileInputStream inStream = new FileInputStream("DemoForSerialization.dat");
        ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

        TestScores[] objectArray1 = new TestScores[5];

        for(int i = 0; i < objectArray.length;i++){
            objectArray1[i] = (TestScores) objectInputFile.readObject();
        }
        objectInputFile.close();
        for (int i = 0; i < objectArray1.length;i++){
            System.out.println(objectArray1[i]);
        }
    }
}
