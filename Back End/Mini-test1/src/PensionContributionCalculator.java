import java.util.Scanner;

public class PensionContributionCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double employeeContribution = 0, employerContribution = 0, totalContribution = 0;
        
        System.out.print("Enter monthly salary: ");
        int salary = scanner.nextInt();
        scanner.nextLine();
        if (salary > 7000){
            salary = 7000;
        }

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        if (age < 45) {
            employeeContribution = salary / 100 * 20;
            employerContribution = salary / 100 * 17;
            totalContribution = employeeContribution + employerContribution;
        }
        if (age > 46 && age < 55) {
            employeeContribution = salary / 100 * 13;
            employerContribution = salary / 100 * 13;
            totalContribution = employeeContribution + employerContribution;
        }
        if (age > 55){
            employeeContribution = salary / 100 * 5.5;
            employerContribution = salary / 100 * 7.5;
            totalContribution = employeeContribution + employerContribution;
        }
        System.out.printf("The employee's contribution: %.2f\n" ,employeeContribution);
        System.out.printf("The employer's contribution: %.2f\n" ,employerContribution);
        System.out.printf("The total contribution is: %.2f",totalContribution);

    }
}
