package parkingticket;

public class PoliceOfficer {
    private String policeName;
    private int badgeNumber;

    public PoliceOfficer(String policeName, int badgeNumber) {
        this.policeName = policeName;
        this.badgeNumber = badgeNumber;
    }


    public String getPoliceName() {
        return policeName;
    }

    public void setPoliceName(String policeName) {
        this.policeName = policeName;
    }

    public int getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(int badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public PoliceOfficer() {
    }

    public boolean examine(ParkedCar time, ParkingMeter minute) {
        int x = time.getMinutes();
        int y = minute.getPurchasedMinute();
        boolean status;
        if (x > y)
            status = true;
        else status = false;

        return status;
    }

    public ParkingTicket writeTicket(ParkedCar time, ParkingMeter minutes) {
        ParkingTicket ticket = new ParkingTicket(time, this, minutes);
        int remainMinute = time.getMinutes() - minutes.getPurchasedMinute();
        if (examine(time, minutes) == true) {
            if (remainMinute <= 60) {
                ticket.setFine(25);
            } else {
                ticket.setFine((25 + (10 * (remainMinute / 60))));
            }
        }
        return ticket;
    }

}
