package payroll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter employee name");
        String name = kb.nextLine();
        System.out.println("Enter employee ID");
        int id = kb.nextInt();

        Payroll payroll = new Payroll(name,id);
        payroll.setHourlyPayRate(50.99);
        payroll.setHoursWorked(40);

        System.out.println(payroll.getGrossPay());
    }
}
