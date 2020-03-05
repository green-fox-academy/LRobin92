public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
        // The program should write the surface area and volume of the cuboid like:
        double a = 3;
        double b = 1.5;
        double c = 4.5;
        double area = 2 * ((a*b) + (a*c) + (b*c));
        double volume = a * b *c;

        System.out.println("The surface area is: " + (double)area);
        System.out.println("The volume is: " + (double)volume);

    // Surface Area: 600
    // Volume: 1000

    }


}
