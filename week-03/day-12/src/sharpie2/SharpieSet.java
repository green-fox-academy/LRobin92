package sharpie2;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    public ArrayList<Sharpie> sharpies;

    //it contains a list of Sharpie
    public SharpieSet() {
        this.sharpies = new ArrayList<>();
    }

    public void add(Sharpie sharpie) {
        this.sharpies.add(sharpie);
    }

    public int countUsable() {
        int counter = 0;
        for (int i = 0; i < this.sharpies.size(); i++) {
            if (this.sharpies.get(i).inkAmount != 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash() {
        for (int i = 0; i < this.sharpies.size(); i++) {
            if (this.sharpies.get(i).inkAmount == 0) {
                this.sharpies.remove(i);
            }
        }

        //countUsable() -> sharpie is usable if it has ink in it
        //removeTrash() -> removes all unusable sharpies


    }
}