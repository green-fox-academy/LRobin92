package Sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie("Red", 154);
        sharpie.use();
        System.out.println(sharpie.inkAmount);
    }
}
