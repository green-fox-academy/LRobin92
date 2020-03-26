package farm;

public class Farm {
    int freeSlots = 0;
    int maxSlot = 4;

    public static void main(String[] args) {
        //Create a Farm class
        //it has list of Animals
        //it has slots which defines the number of free places for animals
        //breed() -> creates a new animal if there's place for it
        //slaughter() -> removes the least hungry animal


        AnimalsInFarm cow1 = new AnimalsInFarm();
        AnimalsInFarm cow2 = new AnimalsInFarm();
        AnimalsInFarm cow3 = new AnimalsInFarm();
        AnimalsInFarm chicken1 = new AnimalsInFarm();
        AnimalsInFarm chicken2 = new AnimalsInFarm();
        AnimalsInFarm chicken3 = new AnimalsInFarm();



    }
    public void breed() {
        freeSlots++;
        if (freeSlots == maxSlot){
            System.out.println("You can not create more animals.");
        }else{
            freeSlots++;
        }

    }
    public void slaughter(){
        freeSlots--;
    }


}
