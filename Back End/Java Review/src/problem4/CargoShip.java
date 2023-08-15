package problem4;

public class CargoShip extends Ship {
    private double cargoCapacity;

    public CargoShip(String shipName, String yearBuilt, double cargoCapacity) {
        super(shipName, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public double getCargoCapacity() {
        return cargoCapacity;
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
        return "Cargo Ship: " +
                "\nShip name: " + getShipName() +
                "\nYear Build: " + getYearBuilt() +
                "\nCargo Capacity: " + cargoCapacity + "\n";
    }
}
