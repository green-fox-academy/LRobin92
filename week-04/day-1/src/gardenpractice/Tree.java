package gardenpractice;

public class Tree extends Plant {

    public Tree(String color) {
        super.color = color;
        setType("Tree");
        super.currentWaterlevel = 0;
    }
    @Override
    public void statusInfo(double water){
        setMaxWaterlevel(10);
        this.currentWaterlevel = water * 0.4;
        System.out.println("current water:" + this.currentWaterlevel);
        if (this.currentWaterlevel < this.maxWaterlevel){
            System.out.println("The "+color+" "+ type + " needs water.");
        }else
            System.out.println("The "+color+" "+ type + " doesnt need water.");
    }
}
