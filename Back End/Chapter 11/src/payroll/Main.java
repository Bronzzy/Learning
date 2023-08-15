package payroll;

import javax.naming.InvalidNameException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InvalidNameException, InvalidEmployeeId,
            InvalidWorkedHours, InvalidHourlyPayRate {

        Scanner kb = new Scanner(System.in);

        System.out.println("Enter employee name");
        String name = kb.nextLine();

        System.out.println("Enter employee id");
        int id = kb.nextInt();

        Payroll payroll = new Payroll(name, id);

        payroll.setHoursWorked(100);
        payroll.setHourlyPayRate(0);
    }
}
