package problem4;

public class Ship {
    private String shipName;
    private String yearBuilt;

    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    @Override
    public String toString() {
        return "Ship: " +
                "\nShip name: " + getShipName() +
                "\nYear Build: " + getYearBuilt() + "\n";
    }
}
