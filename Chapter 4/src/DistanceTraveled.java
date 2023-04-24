import java.util.Scanner;

public class DistanceTraveled
{
    public static void main(String[] args)
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
    }
}
