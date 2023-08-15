package problem4;

public class CruiseShip extends Ship {
    private int numberPassenger;

    public CruiseShip(String shipName, String yearBuilt, int numberPassenger) {
        super(shipName, yearBuilt);
        this.numberPassenger = numberPassenger;
    }

    public int getNumberPassenger() {
        return numberPassenger;
    }

    @Override
    public String getShipName() {
        return super.getShipName();
    }

    @Override
    public String getYearBuilt() {
        return super.getYearBuilt();
    }

    @Override
    public String toString() {
        return "Cruise Ship: " +
                "\nShip name: " + getShipName() +
                "\nYear Build: " + getYearBuilt() +
                "\nMaximum number of Passengers: " + numberPassenger + "\n";
    }
}
