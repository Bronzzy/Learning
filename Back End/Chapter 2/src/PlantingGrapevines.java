import java.util.Scanner;

public class PlantingGrapevines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Input length of row, in feet");
        double R = scanner.nextDouble();
        System.out.println("Input space used by an end-post assembly, in feet");
        double E = scanner.nextDouble();
        System.out.println("Input space between the vines, in feet");
        double S = scanner.nextDouble();
        double V = (R - E*2)/S;
        System.out.println("number of grapevines fit in the row: \n" + V);

    }
}
