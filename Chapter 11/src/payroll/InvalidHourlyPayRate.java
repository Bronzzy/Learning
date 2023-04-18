package payroll;

public class InvalidHourlyPayRate extends Exception {
    public InvalidHourlyPayRate(String message) {
        super(message);
    }
}
