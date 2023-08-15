package carinstrument;

public class Odometer {

    private double currentMileage;
    private FuelGauge fg;

    public Odometer(double currentMileage, FuelGauge fg) {
        this.currentMileage = currentMileage;
        this.fg = fg;
    }

    public void mileIncreased() {
        this.currentMileage++;
        if (this.currentMileage > 999999) {
            this.currentMileage = 0;
        }
    }

    public double getCurrentMileage() {
        return currentMileage;
    }

    public void simulateRun() {
        double temp = fg.getCarFuel();
        for (int i = 0; i <= temp; i++) {
            for (int j = 0; j <= 24; j++) {
                mileIncreased();
                System.out.println(getCurrentMileage());
            }
            fg.discardFuel();
            System.out.println(fg.getCarCurrentFuel());
        }
    }
}
