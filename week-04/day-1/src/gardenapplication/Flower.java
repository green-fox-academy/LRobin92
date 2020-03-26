package gardenapplication;

public class Flower extends Plant{
    //The Flower
    //needs water if its current water amount is less then 5
    //when watering it the flower can only absorb the 75% of the water
    //eg. watering with 10 the flower's amount of water should only increase with 7.5
    public Flower (String color, String type){
        super.color = color;
        super.type = type;
        waterLevel = 0;
    }
    public double statusFlower(double water){
        maxWaterLevel = 5;
        waterLevel = water * 0.75;
        if (waterLevel < maxWaterLevel){
            System.out.println("The "+color+" "+ type + " needs water.");
        }else
            System.out.println("The "+color+" "+ type + " doesnt need water.");
        return water;
    }
}
