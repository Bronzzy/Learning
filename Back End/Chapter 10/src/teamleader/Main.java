package teamleader;

public class Main {
    public static void main(String[] args) {

        TeamLeader teamLeader = new TeamLeader("Winnie", "520 - W", "24/10/2015",
                1, 39.99, 15.99, 40, 35);


        System.out.print("Employee name: " + teamLeader.getEmployeeName());
        System.out.print("\nEmployee number: " + teamLeader.getEmployeeNumber());
        System.out.print("\nEmployee hire date: " + teamLeader.getHireDate());
        System.out.print("\nEmployee shift: "+ teamLeader.getShift());
        System.out.print("\nEmployee hourly pay rate: "+teamLeader.getHourlyPayRate());
        System.out.print("\nEmployee monthly bonus: "+teamLeader.getMONTHLY_BONUS());
        System.out.print("\nEmployee training hours required: "+teamLeader.getTrainingHoursRequired());
        System.out.print("\nEmployee training hours attended: "+teamLeader.getTrainingHoursAttended());
    }
}
