package pirates;

public class BattleApp{
    public static void main(String[] args) {
        Pirate bigBeard = new Pirate("BigBeard");
        Pirate lilRat = new Pirate("Lil Rat");
        Ship ship1 = new Ship("Black parrot");
        Ship ship2 = new Ship("Ugly Dolphin");


        ship1.fillShip();
        ship2.fillShip();
        //System.out.println("ship's crew number: " + ship1.listOfCrew.size());
        ship1.statusOfShip();
        ship2.statusOfShip();
        ship1.battle(ship2);
        ship1.statusOfShip();
        ship2.statusOfShip();

    }
}
