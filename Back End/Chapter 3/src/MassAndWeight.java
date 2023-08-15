import java.util.Scanner;

public class MassAndWeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input object's mass");
        double objectMass = scanner.nextDouble();

        double weight = objectMass * 9.8;

        if(weight > 1000)
            System.out.println("Object too heavy");
        if(weight < 10)
            System.out.println("Object too light");
    }
}
