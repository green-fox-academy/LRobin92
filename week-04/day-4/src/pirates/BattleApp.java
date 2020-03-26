package pirates;

public class BattleApp{
    public static void main(String[] args) {
        Pirate bigBeard = new Pirate("BigBeard");
        Pirate lilRat = new Pirate("Lil Rat");
        Ship ship1 = new Ship();

        ship1.fillShip();
        System.out.println("ship's crew number: " + ship1.listOfCrew.size());


    }
}
