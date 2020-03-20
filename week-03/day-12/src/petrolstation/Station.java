package petrolstation;

public class Station {
    int gasAmount = 200;


    public void refill(Car car){
        car.gasAmount = car.capacity;
        this.gasAmount -= car.capacity;

        System.out.println(car.gasAmount);
        System.out.println("Remaining gas in the station is:" + this.gasAmount);

    }
}
