package exceptionproject;

public class Employee {
    private String employeeName;
    private String employeeNumber;
    private String hireDate;

    public Employee(String employeeName, String employeeNumber, String hireDate) throws InvalidEmployeeNumber {
        this.employeeName = employeeName;
        this.employeeNumber = employeeNumber;
        if(employeeNumber.isEmpty() || employeeNumber.isBlank()){
            throw new InvalidEmployeeNumber();
        }
        this.hireDate = hireDate;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
