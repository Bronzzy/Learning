import java.util.Scanner;

public class RestaurantBill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the charge for the meal");
        double mealCharge = scanner.nextDouble();
        double tax = mealCharge * 0.00675;
        double tip = (mealCharge + tax) * 0.2;
        double totalBill = mealCharge + tax + tip;

        System.out.println("Meal charge is: "+mealCharge);
        System.out.println("Meal tax is: \n" +tax);
        System.out.println("The tip is: \n"+tip);
        System.out.println("The total bill is: \n"+totalBill);


    }
}
