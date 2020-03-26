package farm;

public class AnimalsInFarm {
    int hunger;
    int thirst;

    public  AnimalsInFarm(){
        this.hunger = 50;
        this.thirst = 50;
    }
    public void eat(){
        hunger--;
    }
    public void drink(){
        thirst--;
    }
    public void play(){
        thirst++;
        hunger++;
    }
}
