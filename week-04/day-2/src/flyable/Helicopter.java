package flyable;

public class Helicopter extends Vehicle implements Flyable {
    public Helicopter() {

    }

    @Override
    public void land() {
    }

    @Override
    public void fly() {
        System.out.println("its flying");
    }

    @Override
    public void takeOff() {

    }

}
