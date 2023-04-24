package shipcruiseshipcargoship;

public class CruiseShip extends Ship {
    private int maximumPassenger;

    public CruiseShip(String shipName, String yearBuilt, int maximumPassenger) {
        super(shipName, yearBuilt);
        this.maximumPassenger = maximumPassenger;
    }

    public int getMaximumPassenger() {
        return maximumPassenger;
    }

    public void setMaximumPassenger(int maximumPassenger) {
        this.maximumPassenger = maximumPassenger;
    }

    @Override
    public String toString() {
        return "\nCruiseShip" + "\nshipName: " + getShipName() + "\nyearBuilt: " + getYearBuilt()
                + "\nMaximum number of passengers: " + maximumPassenger;
    }
}
