package aircraft;

public class Main {
    public static void main(String[] args) {
        F35 f351 = new F35();
        F35 f352 = new F35();
        F35 f353 = new F35();
        F35 f354 = new F35();
        Carrier carrier1 = new Carrier(30,1500);
        Carrier carrier2 = new Carrier(20, 1400);

        carrier1.addAircraft(f351);
        carrier1.addAircraft(f352);
        System.out.println(carrier1.getStatusInfo());
        carrier1.fill();
        System.out.println(carrier1.getStatusInfo());
        carrier1.fight(carrier2);
        System.out.println(carrier1.getStatusInfo());
        System.out.println(carrier2.getStatusInfo());


    }
}
