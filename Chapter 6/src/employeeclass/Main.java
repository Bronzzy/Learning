package employeeclass;

public class Main {
    public static void main(String[] args) {

        Employee susanMeyers = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee markJones = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joyRogers = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");

        System.out.println(susanMeyers);
        System.out.println(markJones);
        System.out.println(joyRogers);

    }
}