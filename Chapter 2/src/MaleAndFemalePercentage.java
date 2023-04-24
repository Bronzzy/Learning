import java.util.Scanner;

public class MaleAndFemalePercentage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of males ");
        int males = scanner.nextInt();

        System.out.println("Enter number of females");
        int females = scanner.nextInt();
        int total = males + females;

        System.out.println("Males percentage "+(double)males/total);
        System.out.println("Females percentage "+(double)females/total);
    }
}
