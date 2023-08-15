package employeeandproductionworker;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Binh", "090-B", "30/04/2020");
        ProductionWorker productionWorker = new ProductionWorker(employee.getEmployeeName(),
                employee.getEmployeeNumber(), employee.getHireDate(), 1, 50.00);

        System.out.print("Employee name: " + productionWorker.getEmployeeName());
        System.out.print("\nEmployee number: " + productionWorker.getEmployeeNumber());
        System.out.print("\nEmployee hire date: " + productionWorker.getHireDate());
        System.out.print("\nEmployee shift: " + productionWorker.getShift());
        System.out.print("\nEmployee hourly pay rate: " + productionWorker.getHourlyPayRate());
    }
}