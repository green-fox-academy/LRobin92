package instruments;

public class Violin extends StringedInstrument {
    public Violin(){
        super.name = "Violin";
        super.numberOfStrings = 4;
    }
    @Override
    public String sound() {
        return "Screech";
    }
    @Override
    public void play(){
        System.out.println(this.name + ", is a "+ this.numberOfStrings+ " stringed instrument that goes "+ sound());
    }
}
