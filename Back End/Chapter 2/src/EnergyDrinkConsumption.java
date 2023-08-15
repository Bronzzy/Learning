import java.beans.Customizer;

public class EnergyDrinkConsumption {
    public static void main(String[] args) {
        int customers = 12467;

        System.out.println("number of customer purchase: "+ (int)(customers*0.14));
        System.out.println("number of customer preferd citrus - flavored "+ (int)((customers*0.14)*0.64));
    }
}
