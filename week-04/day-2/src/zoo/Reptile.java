package zoo;

public class Reptile extends Animal {

    public Reptile(String name){
        super.name = name;
        super.gender = "male";
        super.numberOfLegs = 4;
    }
    @Override
    public String breed() {
        return "laying eggs";
    }
}
