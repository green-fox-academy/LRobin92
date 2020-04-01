package zoo;

public class Mammal extends Animal {

    public Mammal(String name){
        super.name = name;
        super.isPredator = true;
        super.age = 2;
    }
    @Override
    public String breed() {
        return "livebearer";
    }
}
