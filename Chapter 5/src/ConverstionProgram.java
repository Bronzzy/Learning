import java.util.Scanner;

public class ConverstionProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        menu();

    }


    public static void menu() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your distance: ");
        double distance = scanner.nextDouble();
        int input;

        do {
            System.out.println("1. Convert to kilometers"+
                    "\n2. Convert to inches" +
                    "\n3. Convert to feet"+
                    "\n4. Quit the program");
            input = scanner.nextInt();
            if (input == 1) {
                showKilometers(distance);
            }
            if (input == 2) {
                showInches(distance);
            }
            if (input == 3) {
                showFeet(distance);
            }
            if (input > 4)
                System.out.println("ERROR!!!!!!");
        }while (input != 4);
    }
    public static void showKilometers (double distance) {
        double kilometers = distance * 0.001;
        System.out.println(kilometers + " km");
    }
    public static void showInches (double distance){
        double inches = distance * 39.37;
        System.out.println(inches + " inches");
    }
    public static void showFeet (double distance) {
        double feet = distance * 3.281;
        System.out.println(feet + " feet");
    }
}
