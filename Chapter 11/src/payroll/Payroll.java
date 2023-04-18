package payroll;

import javax.naming.InvalidNameException;

public class Payroll {
    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private double hoursWorked;

    public Payroll(String employeeName, int idNumber) throws InvalidNameException, InvalidEmployeeId {
        this.employeeName = employeeName;
        if (employeeName.isBlank() || employeeName.isEmpty()) {
            throw new InvalidNameException("Name can not be empty");
        }
        this.idNumber = idNumber;
        if (idNumber <= 0) {
            throw new InvalidEmployeeId("Employee ID can not be negative number or zero");
        }
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) throws InvalidHourlyPayRate {
        this.hourlyPayRate = hourlyPayRate;
        if(hourlyPayRate <0 || hourlyPayRate > 25){
            throw new InvalidHourlyPayRate("Hourly pay rate can not be less than 0 or greater than 25");
        }
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) throws InvalidWorkedHours {
        this.hoursWorked = hoursWorked;
        if(hoursWorked < 0 || hoursWorked > 84){
            throw new InvalidWorkedHours("Worked hours can not be less than 0 or greater than 84");
        }
    }

    public double getGrossPay() {
        double grossPay = this.hourlyPayRate * this.hoursWorked;
        return grossPay;
    }
}
