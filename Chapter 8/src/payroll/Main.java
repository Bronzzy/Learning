package payroll;

import java.util.Scanner;


public class Main {

    private static boolean check_hour_status(int input_hour) {
        if (input_hour < 0) {
            return false;
        }
        return true;
    }

    private static boolean check_payRate_status(double input_payRate) {
        if (input_payRate < 6.0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input_hour = 0;
        double input_payRate = 0;
        PayRoll pay = new PayRoll();

        for (int i = 0; i < pay.employeeID.length; i++) {
            System.out.println("Employee ID: " + pay.employeeID[i]);
            boolean input_hour_status = false;
            boolean input_payRate_status = false;

            do {

                if (input_hour_status == false) {
                    System.out.println("Enter work hour for employee: ");
                    input_hour = keyboard.nextInt();
                    input_hour_status = check_hour_status(input_hour);
                }
                if (input_payRate_status == false) {
                    System.out.println("Enter pay rate for employee: ");
                    input_payRate = keyboard.nextDouble();
                    input_payRate_status = check_payRate_status(input_payRate);
                }
            } while (input_hour_status == false || input_payRate_status == false);

            pay.setPayRate(input_payRate, i);
            pay.setHours(input_hour, i);
        }
        pay.calWage();
        System.out.println(pay);

    }
}