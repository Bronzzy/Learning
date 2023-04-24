import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DistanceFiles
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        double vehicleSpeed,
                hourTravel;

        System.out.println("Input your vehicle speed");
        vehicleSpeed = scanner.nextDouble();

        System.out.println("Input your travel hours");
        hourTravel = scanner.nextDouble();

        System.out.println("Hour    Distance Traveled");
        System.out.println("-------------------------");

        for (int number = 1; number <= hourTravel; number++)
        {
            System.out.println(number + "\t\t" + vehicleSpeed * number);
        }
        System.out.println("What file name do you want?");
        scanner.nextLine();
        String filename = scanner.nextLine();
        PrintWriter outputFile = new PrintWriter(filename);

        for (int count = 1; count <= hourTravel; count++)
        {
            outputFile.println(count + "\t\t\t\t" + vehicleSpeed * count + "\n");
        }
        outputFile.close();
        System.out.println("Data saved to filename " + filename);
    }

}
