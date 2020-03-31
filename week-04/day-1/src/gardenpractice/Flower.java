package gardenpractice;

public class Flower extends Plant {
    public Flower(String color) {
        super.color = color;
        setType("Flower");
        super.currentWaterlevel = 0;
    }
    @Override
    public void statusInfo(double water){
        setMaxWaterlevel(5);
        this.currentWaterlevel = water * 0.75;
        if (this.currentWaterlevel < this.maxWaterlevel){
            System.out.println("The "+color+" "+ type + " needs water.");
        }else
            System.out.println("The "+color+" "+ type + " doesnt need water.");
    }
}
