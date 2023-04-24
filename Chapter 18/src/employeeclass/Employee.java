package employeeclass;

public class Employee {
    private String employeeID;
    private String employeeName;

    public Employee(String employeeID, String employeeName) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    @Override
    public String toString() {
        return "\nEmployee" +
                "\nEmployee ID: " + employeeID +
                "\nEmployee name: " + employeeName;
    }
}
