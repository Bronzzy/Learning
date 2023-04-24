package parkingticket;

public class ParkingMeter {
    private int purchasedMinute;

    public ParkingMeter() {
    }

    public ParkingMeter(int purchasedMinute) {
        this.purchasedMinute = purchasedMinute;
    }

    public int getPurchasedMinute() {
        return purchasedMinute;
    }

    public void setPurchasedMinute(int purchasedMinute) {
        this.purchasedMinute = purchasedMinute;
    }
}
