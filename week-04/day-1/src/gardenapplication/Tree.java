package gardenapplication;

import javax.xml.namespace.QName;

public class Tree extends Plant{
    //The Tree
    //needs water if its current water amount is less then 10
    //when watering it the tree can only absorb the 40% of the water
    //eg. watering with 10 the tree's amount of water should only increase with 4
    public Tree (String color, String type){
        super.color = color;
        super.type = type;
        waterLevel = 0;
    }
    public double statusTree(double water){
        maxWaterLevel = 10;
        waterLevel = water * 0.4;
        if (waterLevel < maxWaterLevel){
            System.out.println("The "+color+" "+ type + " needs water.");
        }else
            System.out.println("The "+color+" "+ type + " doesnt need water.");
        return water;
    }
}
