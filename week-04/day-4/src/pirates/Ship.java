package pirates;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship extends BattleApp{

    //Create a Ship class.
    //The Ship stores Pirate-s instances in a list as the crew and has one captain who is also a Pirate.
    //When a ship is created it doesn't have a crew or a captain.
    //The ship can be filled with pirates and a captain via fillShip() method.
    //Filling the ship with a captain and random number of pirates.
    //Ships should be represented in a nice way on command line including information about
    //captains consumed rum, state (passed out / died)
    //number of alive pirates in the crew
    //Ships should have a method to battle other ships: ship.battle(otherShip)
    //should return true if the actual ship (this) wins
    //the ship should win if its calculated score is higher
    //calculate score: Number of Alive pirates in the crew - Number of consumed rum by the captain
    //The loser crew has a random number of losses (deaths).
    //The winner captain and crew has a party, including a random number of rum :)
    List<Pirate> listOfCrew;
    Pirate captain;
    String shipName;
    boolean win;
    Random random = new Random();
    public Ship(String shipName){
        this.shipName = shipName;
        listOfCrew = new ArrayList<>();
        fillShip();
    }

    public void fillShip(){
        this.captain = new Pirate();
        int crew = random.nextInt(10) + 1;
        for (int i = 1; i < crew; i++) {
            listOfCrew.add(new Pirate());
        }
    }
    public void statusOfShip(){
        this.captain.getStatus();
        System.out.println("The captain consumed: " + this.captain.getRumLevel() + "l of rum");
        System.out.println("Alive member(s) in the ship: " + this.listOfCrew.size());
    }
    public void battle(Ship ship){
        int score = this.listOfCrew.size() - this.captain.getRumLevel();
        int score2 = ship.listOfCrew.size() - ship.captain.getRumLevel();
        int deadCrew = random.nextInt(this.listOfCrew.size());
        int deadCrew2 = random.nextInt(ship.listOfCrew.size());
        int randomRum = random.nextInt(5);
        if (score > score2){
            win = true;
            System.out.println(this.shipName + " wins this fight");
            for (int i = 0; i < deadCrew2 -1; i++) {
                ship.listOfCrew.remove(i);
            }
            this.captain.setRumLevel(randomRum);
        }else if (score == score2){
            System.out.println("Its a draw mate");
        }else {
            win = false;
            System.out.println(ship.shipName + " wins this fight");
            for (int i = 0; i < deadCrew -1; i++) {
                this.listOfCrew.remove(i);
            }
            ship.captain.setRumLevel(randomRum);
        }
    }
}
