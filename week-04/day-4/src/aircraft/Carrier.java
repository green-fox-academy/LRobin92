package aircraft;

import java.util.ArrayList;
import java.util.List;
//The carrier should be able to store aircrafts
//Each carrier should have a store of ammo represented as number
//The initial ammo should be given by a parameter in its constructor
//The carrier also has a health point given in its constructor as well
//Methods
//add
//It should take a new aircraft and add it to its storage
//fill
//It should fill all the aircraft with ammo and subtract the needed ammo from the ammo storage
//If there is not enough ammo then it should start to fill the aircrafts with priority first
//If there is no ammo when this method is called, it should throw an exception
//fight
//It should take another carrier as a reference parameter and fire all the ammo from the aircrafts to it, then subtract all the damage from its health points
//getStatus
//It should return a string about itself and all of its aircrafts' statuses in the following format:
public class Carrier {
    List<Aircrafts> listOfAircrafts;
    int storedAmmo;
    int healthPoints;

    public Carrier(int storedAmmo, int healthPoints){
        listOfAircrafts = new ArrayList<>();
        this.healthPoints = healthPoints;
        this.storedAmmo = storedAmmo;
    }
    public void addAircraft(Aircrafts aircrafts){
        listOfAircrafts.add(aircrafts);
        this.storedAmmo += aircrafts.currentAmmo;
    }
    public void fill(){
        if (this.storedAmmo == 0){
            System.out.println("There is no ammo in this carrier");
        }else if(this.storedAmmo >= getAmmoNeeded()){
            for (Aircrafts a : listOfAircrafts) {
                this.storedAmmo = a.refill(this.storedAmmo);
            }
        }else if (this.storedAmmo < getAmmoNeeded()){
            for (Aircrafts a: listOfAircrafts) {
                if (a.isPriority){
                    this.storedAmmo = a.refill(this.storedAmmo);
                }
            }
            for (Aircrafts a: listOfAircrafts) {
               if (this.storedAmmo == 0){
                   break;
               } else if (a.maxAmmo <= this.storedAmmo){
                   this.storedAmmo = a.refill(this.storedAmmo);
               }
            }
        }
    }
    public int getAmmoNeeded(){
        int sum = 0;
        for (Aircrafts a: listOfAircrafts) {
            sum += a.maxAmmo;
        }return  sum;
    }
    public void fight(Carrier carrier) {
        carrier.healthPoints -= this.getTotalDamage();
        for (Aircrafts a: listOfAircrafts) {
            a.currentAmmo = 0;
        }
    }

    public int getTotalDamage() {
        int totalDamage = 0;
        for (Aircrafts aircrafts : this.listOfAircrafts) {
            totalDamage += aircrafts.currentAmmo * aircrafts.baseDamage;
        }
        return totalDamage;
    }

    public String carrierStatus(){
        return "HP: " + this.healthPoints+ " Aircraft count: "+ this.listOfAircrafts.size() + ", Ammo Storage: " + this.storedAmmo+ ", Total damage: " + this.getTotalDamage() +
                " + \n" +
                "Aircrafts:\n";
    }
    public String aircraftsStatus(){
        String statusList = "";
        for (Aircrafts aircrafts : this.listOfAircrafts) {
            statusList += aircrafts.getStatus() + "\n";
        }
        if (this.healthPoints <= 0){
            System.out.println("It's dead Jim");
        }
        return statusList;
    }
    public String getStatusInfo(){
        String status = this.carrierStatus() + this.aircraftsStatus();
        return status;
    }
}
