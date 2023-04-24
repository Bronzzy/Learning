import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double mass;
        double velocity;
        double kineticEnergy;

        System.out.println("Enter object's mass");
        mass = scanner.nextDouble();

        System.out.println("Enter object's velocity");
        velocity = scanner.nextDouble();
        kineticEnergy(mass, velocity);
    }


    public static void kineticEnergy(double mass, double velocity) {

        double kineticEnergy = (mass * Math.pow(velocity,2)/2);
        System.out.println("Object's Kinetic energy is: " + kineticEnergy);
    }
}

