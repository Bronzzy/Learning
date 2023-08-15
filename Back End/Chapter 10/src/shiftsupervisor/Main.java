package shiftsupervisor;

import employeeandproductionworker.Employee;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ShiftSupervisor shiftSupervisor = new ShiftSupervisor("Jackey", "295 - J", "04/07/2020",
                69999.99, 6999.99);

        System.out.println("Supervisor name: " + shiftSupervisor.getEmployeeName());
        System.out.println("Supervisor number: " + shiftSupervisor.getEmployeeNumber());
        System.out.println("Supervisor hire date: " + shiftSupervisor.getHireDate());
        System.out.println("Supervisor annual salary: " + shiftSupervisor.getAnnualSalary());
        System.out.println("Supervisor annual production bonus: " + shiftSupervisor.getAnnualProductionBonus());
    }
}
