package problem4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Ship> seaport = new ArrayList<>();

        CruiseShip titanic = new CruiseShip("RMS Titanic","1911", 3327);
        CruiseShip achilleLauro = new CruiseShip("Achille Lauro","1947", 869);
        CruiseShip adonia = new CruiseShip("Adonia","2001", 	777);
        CargoShip irina = new CargoShip(" MSC Irina","2023", 24346 );
        CargoShip everAlot = new CargoShip("Ever Alot","2022", 24004 );

        seaport.add(titanic);
        seaport.add(achilleLauro);
        seaport.add(adonia);
        seaport.add(irina);
        seaport.add(everAlot);

        for (Ship ship: seaport) {
            System.out.println(ship);
        }
    }
}
