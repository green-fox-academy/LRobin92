package Animal;

public class Main {
    public static void main(String[] args) {
        Animal zebra = new Animal();

        zebra.eat();
        zebra.drink();
        System.out.println(zebra.hunger + " and " + zebra.thirst);
    }
}
