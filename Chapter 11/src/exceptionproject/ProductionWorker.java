package exceptionproject;

public class ProductionWorker extends Employee {

    private final int SHIFT_DAY = 1;
    private final int SHIFT_NIGHT = 2;

    private int shift;
    private double hourlyPayRate;

    public ProductionWorker(String employeeName, String employeeNumber,
                            String hireDate, int shift, double hourlyPayRate) throws InvalidEmployeeNumber,
            InvalidShift, InvalidPayRate {
        super(employeeName, employeeNumber, hireDate);
        this.shift = shift;
        if (shift != 1 && shift != 2) {
            throw new InvalidShift();
        }
        this.hourlyPayRate = hourlyPayRate;
        if(hourlyPayRate < 0){
            throw new InvalidPayRate();
        }
    }

    public int getSHIFT_DAY() {
        return SHIFT_DAY;
    }

    public int getSHIFT_NIGHT() {
        return SHIFT_NIGHT;
    }

    public int getShift() {
        return shift;
    }

    public void setShift(int shift) {
        this.shift = shift;
    }

    public double getHourlyPayRate() {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }
}

