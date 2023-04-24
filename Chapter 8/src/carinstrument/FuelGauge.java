package carinstrument;

public class FuelGauge {

    private double carCurrentFuel;
    private double reportCarCurrentFuel;
    public FuelGauge(double carCurrentFuelFuel) {
        this.carCurrentFuel = carCurrentFuelFuel;
    }
    public double getCarFuel(){
        return carCurrentFuel;
    }
    public double getCarCurrentFuel() {
        return carCurrentFuel;
    }

    public void getFuel() {
        this.carCurrentFuel++;
        if (this.carCurrentFuel >= 15) {
            this.carCurrentFuel = 15;
        }
    }

    public void discardFuel() {
        carCurrentFuel --;
        if (carCurrentFuel < 0) {
            carCurrentFuel = 0;
        }
    }
}
