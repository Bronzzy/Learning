import java.util.Scanner;

public class Miles_per_Gallon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your miles driven");
        double milesDriven = scanner.nextDouble();

        System.out.println("Input your gallon of gas used");
        double gasUsed = scanner.nextDouble();
        double MPG = milesDriven/gasUsed;

        System.out.println("The car MPG is: \n" +MPG);
    }
}
