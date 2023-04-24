package shipcruiseshipcargoship;

public class CargoShip extends Ship {
    private int cargoCapacity;

    public CargoShip(String shipName, String yearBuilt, int cargoCapacity) {
        super(shipName, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public String toString() {
        return "\nCargoShip" + "shipName: " + getShipName() + "\nyearBuilt: " + getYearBuilt()
                + "\ncargoCapacity: " + cargoCapacity;
    }
}
