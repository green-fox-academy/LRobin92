package gardenpractice;

public class Plant {
    double currentWaterlevel;
    double maxWaterlevel;
    String color;
    String type;


    public Plant(String color){
        this.color = color;
        this.currentWaterlevel = 0;
    }
    public Plant(){}
    public void setMaxWaterlevel(int maxWaterlevel) {
        this.maxWaterlevel = maxWaterlevel;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void statusInfo(double water){
    }


}
