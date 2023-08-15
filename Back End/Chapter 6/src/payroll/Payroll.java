package payroll;

public class Payroll {
    private String employeeName;
    private int idNumber;
    private double hourlyPayRate;
    private double hoursWorked;

    public Payroll(String employeeName, int idNumber) {
        this.employeeName = employeeName;
        this.idNumber = idNumber;
    }

    public double getGrossPay(){
        double grossPay = this.hourlyPayRate * this.hoursWorked;
        return grossPay;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
