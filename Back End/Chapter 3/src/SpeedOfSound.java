import java.util.Scanner;

public class SpeedOfSound {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter medium you want to calculate");
        String medium = scanner.nextLine();
        System.out.println("Please enter the distance");
        double distance = scanner.nextDouble();

        if(medium.equalsIgnoreCase("air"))
            System.out.println("The time need to take is: " + distance/1100);
        if(medium.equalsIgnoreCase("water"))
            System.out.println("The time need to take is: " + distance/4900);
        if(medium.equalsIgnoreCase("steel"))
            System.out.println("The time need to take is: " + distance/16400);
    }
}
