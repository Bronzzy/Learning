import java.util.Scanner;

public class FatGramCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of calories");
        double calories = scanner.nextDouble();

        System.out.println("Enter the number of fat grams");
        double fatGrams = scanner.nextDouble();

        double caloriesFromFat = fatGrams * 9;
        double percentageCalories = caloriesFromFat/calories;

        if(percentageCalories < 0.3)
            System.out.println("The food is low in fat");
        if(percentageCalories > 1)
            System.out.println("Error! Input is invalid");

    }
}
