package fleetofthings;

public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();
        Thing milk = new Thing("Get milk");
        Thing obstacles = new Thing("Remove obstacles");
        Thing standup = new Thing("Stand up");
        Thing lunch = new Thing("Eat lunch");

        fleet.add(milk);
        fleet.add(obstacles);
        standup.complete();
        fleet.add(standup);
        lunch.complete();
        fleet.add(lunch);

        // - You have the `Thing` class
        // - You have the `Fleet` class
        // - You have the `FleetOfThings` class with a `main` method
        // - Download those, use those
        // - In the main method create a fleet
        // - Achieve this output:

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
    }
}