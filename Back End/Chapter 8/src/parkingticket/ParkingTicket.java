package parkingticket;

public class ParkingTicket {
    private ParkedCar car;
    private PoliceOfficer police;
    private ParkingMeter parkingMeter;
    private double fine;

    public ParkingTicket() {
    }

    public ParkingTicket(ParkedCar car, PoliceOfficer police, ParkingMeter parkingMeter) {
        this.car = car;
        this.police = police;
        this.parkingMeter = parkingMeter;
    }

    public ParkingTicket(double fine) {
        this.fine = fine;
    }

    public ParkedCar getCar() {
        return car;
    }

    public void setCar(ParkedCar car) {
        this.car = car;
    }

    public PoliceOfficer getPolice() {
        return police;
    }

    public void setPolice(PoliceOfficer police) {
        this.police = police;
    }

    public ParkingMeter getParkingMeter() {
        return parkingMeter;
    }

    public void setParkingMeter(ParkingMeter parkingMeter) {
        this.parkingMeter = parkingMeter;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }


    @Override
    public String toString() {
        return
                "car= " + car.getMake() + "Car model= " + car.getModel() + " Car License Number= " + car.getLicenseNumber()
                        + " Car color= " + car.getColor() +
                        ", police= " + police.getPoliceName() + " Police badge number= " + police.getBadgeNumber()
                        + "Fine= " + fine
                ;

    }
}

