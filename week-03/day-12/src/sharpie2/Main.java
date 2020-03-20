package sharpie2;

public class Main {
    public static void main(String[] args) {
        Sharpie sharpie = new Sharpie();
        SharpieSet sharpies = new SharpieSet();
        Sharpie emptySharpie = new Sharpie();
        emptySharpie.inkAmount = 0;

        //sharpie.use();
        //System.out.println(sharpie.inkAmount);
        System.out.println(sharpies.sharpies.size());
        sharpies.add(emptySharpie);
        sharpies.add(sharpie);

        System.out.println(sharpies.sharpies.size());
        System.out.println(sharpies.countUsable());
        sharpies.removeTrash();
        System.out.println(sharpies.sharpies.size());
    }
}
