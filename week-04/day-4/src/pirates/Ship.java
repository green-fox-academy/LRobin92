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
    public Ship(){
        listOfCrew = new ArrayList<>();
        fillShip();
    }

    public void fillShip(){
        Random random = new Random();
        int crew = random.nextInt(10);
        for (int i = 1; i < crew; i++) {
            listOfCrew.add(new Pirate());
        }

    }
}
