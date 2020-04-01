package zoo;

public class Bird extends Animal {

    public Bird(String name) {
        super.numberOfLegs = 2;
        super.name = name;

    }

    @Override
    public String breed() {
        return "egg";
    }
}
