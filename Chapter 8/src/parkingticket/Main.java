package parkingticket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //report car
        System.out.println("Enter car make");
        String carMake = keyboard.nextLine();
        System.out.println("Enter car model");
        String carModel = keyboard.nextLine();
        System.out.println("Enter car color");
        String carColor = keyboard.nextLine();
        System.out.println("Enter car license number");
        int carNumber = keyboard.nextInt();
        keyboard.nextLine();


        //report policeOfficer
        System.out.println("Enter the officer name");
        String officerName = keyboard.nextLine();
        System.out.println("Enter the officer badge number ");
        int officerBadge = keyboard.nextInt();
        PoliceOfficer police = new PoliceOfficer(officerName, officerBadge);

        //get minute car park
        System.out.println("Enter minute of car park");
        int minute = keyboard.nextInt();
        keyboard.nextLine();
        ParkedCar car = new ParkedCar(carMake, carModel, carColor, carNumber, minute);

        //Get minute purchase
        System.out.println("Enter purchased minute of car park");
        int purchasedMinute = keyboard.nextInt();
        ParkingMeter purchased = new ParkingMeter(purchasedMinute);

        if (police.examine(car, purchased)) {
            ParkingTicket report = police.writeTicket(car, purchased);

            System.out.println("Ticket generate");
            System.out.println(report);

        } else System.out.println("No ticket");
    }
}
