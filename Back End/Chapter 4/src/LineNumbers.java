import java.io.*;
import java.util.Scanner;

public class LineNumbers
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter file name: ");
        String name = scanner.nextLine();

        File input = new File(name);
        Scanner object = new Scanner(input);
        int lines = 1;
        while (object.hasNext())
        {
            String line = object.nextLine();
            System.out.println(line + ";" + lines);
            lines++;

        }
        object.close();
    }
}