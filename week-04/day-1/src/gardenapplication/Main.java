package gardenapplication;

public class Main {
    public static void main(String[] args) {
        Tree tree1 = new Tree("purple", "tree");
        Tree tree2 = new Tree("orange", "tree");
        Flower flower1 = new Flower("yellow", "flower");
        Flower flower2 = new Flower("blue", "flower");
        Garden garden = new Garden();

        garden.addFlower(flower1);
        garden.addFlower(flower2);
        garden.addTree(tree1);
        garden.addTree(tree2);

        System.out.println(flower1.statusFlower(flower1.waterLevel));
        System.out.println(flower2.statusFlower(flower2.waterLevel));
        System.out.println(tree1.statusTree(tree1.waterLevel));
        System.out.println(tree2.statusTree(tree2.waterLevel));
        System.out.println(garden.addWater(40));
        System.out.println(flower1.statusFlower(garden.watering(garden.countedWater)));
        System.out.println(flower2.statusFlower(garden.watering(garden.countedWater)));
        System.out.println(tree1.statusTree(garden.watering(garden.countedWater)));
        System.out.println(tree2.statusTree(garden.watering(garden.countedWater)));
        System.out.println(garden.addWater(70));
        System.out.println(flower1.statusFlower(garden.watering(garden.countedWater)));
        System.out.println(flower2.statusFlower(garden.watering(garden.countedWater)));
        System.out.println(tree1.statusTree(garden.watering(garden.countedWater)));
        System.out.println(tree2.statusTree(garden.watering(garden.countedWater)));

    }
}
