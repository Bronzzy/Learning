import java.util.Scanner;

public class HotelOccupancy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int occupied = 0;
        int room = 0;
        int totalRoom = 0;
        int totalOccupied = 0;
        int vacant = 0;


        System.out.println("Enter number of hotel floor");
        int floors = scanner.nextInt();
        scanner.nextLine();
        if(floors < 1)
            return;


        for (int i = 1; i <= floors; i++)
        {
            System.out.println("Enter number of room on floor " + i);
            room = scanner.nextInt();
            scanner.nextLine();
            if (room < 10)
                return;

            System.out.println("Enter number of occupied room");
            occupied = scanner.nextInt();
            scanner.nextLine();


            totalRoom += room;
            totalOccupied += occupied;

        }
        vacant = totalRoom - totalOccupied;
        double rate = (double)totalOccupied / totalRoom;
        System.out.println("Total Rooms\t\t" + "Total Occupied\t\t" + "Vacant\t\t" + "Rate");
        System.out.println(totalRoom + "\t\t\t\t" + totalOccupied + "\t\t\t\t\t" + vacant + "\t\t\t" + rate*100+"%");


    }
}