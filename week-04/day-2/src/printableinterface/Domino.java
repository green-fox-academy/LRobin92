package printableinterface;

public class Domino implements Printable {
    int aSide = 3;
    int bSide = 2;

    @Override
    public void printAllFields() {
        System.out.println("Domino A side: "+ aSide + ", B side: " + bSide);
    }
}
