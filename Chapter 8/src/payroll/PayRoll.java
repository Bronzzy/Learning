package payroll;

import java.util.Arrays;

public class PayRoll {
    int[] employeeID = {
            5658845,
            4520125,
            7895122,
            8777541,
            8451277,
            1302850,
            7580489
    };
    private int[] hours;
    private double[] payRate;
    private double[] wages;

    public PayRoll() {
        int len_employee = this.employeeID.length;
        this.hours = new int[len_employee];
        this.payRate = new double[len_employee];
        this.wages = new double[len_employee];
    }

    public int[] getHours() {
        return hours;
    }

    public void setHours(int input_hour, int i) {
        this.hours[i] = input_hour;
    }

    public double[] getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate, int i) {
        this.payRate[i] = payRate;
    }

    public double[] getWages() {
        return wages;
    }

    public void setWages(double wages, int i) {
        this.wages[i] = wages;
    }

    public void calWage() {
        double[] wages = this.wages;
        int[] hour = this.hours;
        double[] rate = this.payRate;
        for (int i = 0; i < wages.length; ++i) {
            wages[i] = hour[i] * rate[i];
        }
    }


    @Override
    public String toString() {
        return "PayRoll{" +
                "employeeID=" + Arrays.toString(employeeID) +
                ", hours=" + Arrays.toString(hours) +
                ", payRate=" + Arrays.toString(payRate) +
                ", wages=" + Arrays.toString(wages) +
                '}';
    }
}

