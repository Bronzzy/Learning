package employeeclass;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        Map<String, Employee> employeeMap = new HashMap<>();

        Employee tung = new Employee("3421","Tung");
        Employee khanh = new Employee("5634","Khanh");
        Employee binh = new Employee("9078","Binh");
        Employee nhan = new Employee("6745","Nhan");

        employeeMap.put(tung.getEmployeeID(),tung);
        employeeMap.put(khanh.getEmployeeID(),khanh);
        employeeMap.put(binh.getEmployeeID(),binh);
        employeeMap.put(nhan.getEmployeeID(),nhan);

        System.out.println("Searching for employee with ID");
        String id = kb.nextLine();
        Employee foundEmployee = employeeMap.get(id);

        if(foundEmployee != null){
            System.out.println(foundEmployee);
        }else{
            System.out.println("Employee was not in the set.");
        }
    }
}
