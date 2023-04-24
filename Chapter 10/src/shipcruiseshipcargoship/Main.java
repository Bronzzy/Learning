package shipcruiseshipcargoship;

public class Main {
    public static void main(String[] args) {
        Ship ship1 = new Ship("Yamato","1942");
        CruiseShip ship2 = new CruiseShip("Yokohama", "1950", 350);
        CargoShip ship3 = new CargoShip("Nakagawa", "1690", 10);

        Ship[] ship = new Ship[3];
        ship[0] = ship1;
        ship[1] = ship2;
        ship[2] = ship3;
        System.out.println(ship[0]);
        System.out.println(ship[1]);
        System.out.println(ship[2]);
    }
}
