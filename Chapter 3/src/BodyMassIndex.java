import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your weight");
        double weight = scanner.nextDouble();

        System.out.println("Input your height");
        double height = scanner.nextDouble();

        double BMI = weight * (703/(Math.pow(height,2)));
        System.out.println("Your BMI is: "+BMI);

        if (BMI >= 18.5 && BMI <= 25)
            System.out.println("The person is considered optimal");
        if (BMI < 18.5)
            System.out.println("The person is consider underweight");
        if (BMI > 25)
            System.out.println("The person is consider overweight");

    }
}
