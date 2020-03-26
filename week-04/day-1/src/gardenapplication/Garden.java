package gardenapplication;

import greenfoxorganization.Mentor;
import greenfoxorganization.Student;

import java.util.ArrayList;
import java.util.List;

public class Garden {
    //The Garden
    //is able to hold unlimited amount of flowers or trees
    //when watering it should only water those what needs water with equally divided amount amongst them
    //eg. watering with 40 and 4 of them need water then each gets watered with 10
    List<Flower> flowers = new ArrayList<>();
    List<Tree> trees = new ArrayList<>();
    double addedWater;
    double countedWater;
    public Garden(){
    }
    public void addTree(Tree tree) {
        this.trees.add(tree);
    }
    public void addFlower(Flower flower) {
        this.flowers.add(flower);
    }
    public double addWater(double water){
        this.addedWater = water;
        System.out.println("added " +water + " l");
        this.countedWater = water / ( flowers.size() + trees.size());
        return this.countedWater;
    }
    public double watering(double water){
        this.countedWater = water;
        return water;
    }

}
